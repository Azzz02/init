package com.azzz.init.model.vo.postfavour;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class PostFavourVO implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 帖子 id
     */
    private Long postid;

    /**
     * 创建用户 id
     */
    private Long userid;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 更新时间
     */
    private Date updatetime;

    private static final long serialVersionUID = 1L;
}