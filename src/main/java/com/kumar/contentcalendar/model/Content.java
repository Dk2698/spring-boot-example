package com.kumar.contentcalendar.model;

import java.time.LocalDateTime;

public record Content(
        Integer id,
        String title,
        String desc,
        Status status,
        ContentType contentType,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated,
        String url
) {
}
