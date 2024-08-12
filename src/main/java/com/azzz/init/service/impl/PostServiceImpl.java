package com.azzz.init.service.impl;

import com.azzz.init.model.entity.post.Post;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.azzz.init.service.PostService;
import com.azzz.init.mapper.PostMapper;
import org.springframework.stereotype.Service;

/**
* @author admin
* @description 针对表【post(帖子)】的数据库操作Service实现
* @createDate 2024-08-12 09:50:06
*/
@Service
public class PostServiceImpl extends ServiceImpl<PostMapper, Post>
    implements PostService{

}




