package com.db.xxii_century_school;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Exam {
    private int exam_id;
    private int teacher_id;
    private String url;
}
