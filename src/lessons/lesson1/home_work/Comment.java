package lessons.lesson1.home_work;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Comment {
    private int postId;
    private int id;
    private String name;
    private String email;
    private String body;
    }

