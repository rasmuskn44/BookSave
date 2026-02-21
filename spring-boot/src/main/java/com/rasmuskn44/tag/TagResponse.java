package com.rasmuskn44.tag;

public record TagResponse(Long id, String tag) {
    public TagResponse(Tag tag){this(tag.getId(), tag.getTag());}
}
