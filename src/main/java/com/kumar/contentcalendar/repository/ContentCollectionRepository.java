package com.kumar.contentcalendar.repository;

import com.kumar.contentcalendar.model.Content;
import com.kumar.contentcalendar.model.ContentType;
import com.kumar.contentcalendar.model.Status;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {
    private final List<Content> contents = new ArrayList<>();

    public ContentCollectionRepository(){
    }
    public List<Content> findAll(){
        return contents;
    }

    public Optional<Content> findById(Integer id){
        return contents.stream().filter(c -> c.id().equals(id)).findFirst();
    }

    public void save(Content content){
        contents.removeIf(c -> c.id().equals(content.id()));
        contents.add(content);
    }

    @PostConstruct
    private void init(){
        Content c = new Content(1,
                "My first Blog Post",
                "My first Blog Post",
                Status.IDEA,
                ContentType.ARTICLE,
                LocalDateTime.now(),
                null,
                ""
                );
        contents.add(c);
    }

    public boolean existsById(Integer id) {
        return contents.stream().filter(c -> c.id().equals(id)).count() ==1;
    }

    public void delete(Integer id) {
        contents.removeIf(c -> c.id().equals(id));
    }
}
