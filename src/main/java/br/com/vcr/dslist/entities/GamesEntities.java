package br.com.vcr.dslist.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "games")
public class GamesEntities {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_game", nullable = false, unique = true)
    private Integer id;

    @Column(name = "title", nullable = true)
    private String title;

    @Column(name = "game_year", nullable = true)
    private Integer year;

    @Column(name = "genre", nullable = true)
    private String genre;

    @Column(name = "platforms", nullable = true)
    private String platforms;

    @Column(name = "score", nullable = true)
    private Double score;

    @Column(name = "img_url", nullable = true)
    private String imgUrl;

    @Column(name = "short_description", nullable = true)
    private String shortDescription;

    @Column(name = "long_description", nullable = true)
    private String longDescription;


    // @Override
    // public int hashCode(){
    //     return Objects.hash(id);
    // }

    // @Override
    // public boolean equals (Object obj){
    //     if (this == obj)
    //         return true;
    //     if (obj == null)
    //         return false;
    //     if(getClass() !=obj.getClass())
    //         return false;
        
    //     GamesEntities other = (GamesEntities) obj;
    //     return Objects.equals(id, other.id);

    // }

}
