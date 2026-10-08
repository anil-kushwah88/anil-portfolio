package com.anil.portfolio.model;

import java.util.List;

/** Leave liveUrl / codeUrl as "" to hide that icon. */
public record Project(String title, String description, List<String> stack,
                      String liveUrl, String codeUrl) {
}
