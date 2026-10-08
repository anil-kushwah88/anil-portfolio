package com.anil.portfolio.model;

import java.util.List;

public record Experience(String period, String role, String company, List<String> points) {
}
