package dev.farhan.movies;

import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.bson.types.ObjectId;
import java.util.List;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Document(collection= "movies")
@Data
@AllArgsConstructor
public class Movie {
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;

    @DocumentReference
    private List<Review> reviewIds;

}