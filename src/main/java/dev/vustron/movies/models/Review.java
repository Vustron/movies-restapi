package dev.vustron.movies.models;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
  
  private ObjectId id;
  private String body;
  
  public Review(String body){
    this.body = body;
  }
}
