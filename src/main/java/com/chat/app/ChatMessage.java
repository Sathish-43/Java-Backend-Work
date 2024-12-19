package com.chat.app;

public class ChatMessage {
    private String username;
    private String content;

    // Default Constructor
    public ChatMessage() {
    	
    }


    
    // Parameterized Constructor
    public ChatMessage(String username, String content) {
        this.username = username;
        this.content = content;
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
