package com.anil.portfolio.model;

import java.util.List;

public record Profile(String name, String title, String tagline, String about,
                      String email, String phone, String phoneDisplay,
                      String location, List<String> roles) {
}
