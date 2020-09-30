package br.edu.fasam.mobile.nomecomercialdoaplicativo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Post {
    private Integer userId;
    private Integer id;
    private String title;
    private String body;



}
