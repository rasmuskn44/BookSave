package com.rasmuskn44.language;

public record LanguageResponse(Long id, String language) {
    public LanguageResponse(Language language) {this(language.getId(), language.getLanguage());}
}
