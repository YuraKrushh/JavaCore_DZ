package lessons.lesson1.home_work;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Post {
    private int userId;
    private int id;
    private String title;
    private String body;

}
