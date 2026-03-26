package com.ai_project;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Main {

    private static final String API_KEY = "";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("\nEnter query (type exit to quit): ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Program ended.");
                break;
            }

            try {

            	userInput = userInput.replace("\"", "");
            	String prompt =
            			"Convert the following sentence into a SQL query. " +
            			"Return ONLY the SQL query without explanation:\n" + userInput;

                String response = askGemini(prompt);

                System.out.println("\n===== AI SQL Generator =====");
                System.out.println("Generated SQL:");
                System.out.println("-----------------------------");
                System.out.println(response);
                System.out.println("-----------------------------");

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        }

        scanner.close();
    }

 
	public static String askGemini(String prompt) throws Exception {

    	String endpoint = "https://generativelanguage.googleapis.com/v1beta/models/gemini-flash-latest:generateContent?key=" + API_KEY;

    	URI uri = new URI(endpoint);
    	URL url = uri.toURL();

    	HttpURLConnection conn = (HttpURLConnection) url.openConnection();

    	conn.setRequestMethod("POST");
    	conn.setRequestProperty("Content-Type", "application/json");

    	conn.setDoOutput(true);

        String jsonInput = "{"
                + "\"contents\": ["
                + "{ \"parts\": [{\"text\": \"" + prompt + "\"}] }"
                + "]"
                + "}";

        OutputStream os = conn.getOutputStream();
        os.write(jsonInput.getBytes());
        os.flush();
        os.close();

        InputStream stream;

        if (conn.getResponseCode() >= 400) {
            stream = conn.getErrorStream();
        } else {
            stream = conn.getInputStream();
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(stream));

        String line;
        StringBuilder response = new StringBuilder();

        while ((line = br.readLine()) != null) {
            response.append(line);
        }

        br.close();

      
        String res = response.toString();

        String sql = "";
        boolean found = false;

        for (int i = 0; i < res.length() - 7; i++) {

            if (res.substring(i, i + 7).equals("\"text\":")) {

                int start = res.indexOf("\"", i + 7) + 1;
                int end = res.indexOf("\"", start);

                sql = res.substring(start, end);
                sql = sql.replace("\\n", "\n");

                found = true;
                break;
            }
        }

        if (found) {
            return sql;
        } else {
            return "SQL not found in response.";
        }
    }
}
