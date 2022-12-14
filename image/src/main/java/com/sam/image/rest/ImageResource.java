package com.sam.image.rest;

import com.sam.image.dto.Image;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/image")
public class ImageResource {
    @GetMapping("/")
    public List<Image> getImages() {
        List<Image> images = Arrays.asList(
                new Image(1L, "Treehouse of Horror V", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3842005760"),
                new Image(2L, "The Town", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3698134272"),
                new Image(3L, "The Last Traction Hero", "https://www.imdb.com/title/tt0096697/mediaviewer" +
                        "/rm1445594112"));
        return images;
    }
}
