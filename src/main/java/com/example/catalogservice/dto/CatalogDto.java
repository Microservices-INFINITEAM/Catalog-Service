package com.example.catalogservice.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Data
public class CatalogDto implements Serializable {
    private String musicId;
    private Integer qty;
    private Integer musicPrice;
    private Integer totalPrice;

    private String orderId;
    private String userId;


    private String musicName;
    private String musicArtistname;
    private String musicWritername;
    private String musicLiricistname;
    private Integer musicStock;

    private String musicGenre;
    private Date createAt;



}
