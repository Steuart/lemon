package top.joylife.lemon.dao;

import org.apache.ibatis.annotations.Param;
import top.joylife.lemon.controller.vo.TagVo;
import top.joylife.lemon.entity.Tag;

import java.util.List;

public interface TagMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Tag record);

    int insertSelective(Tag record);

    Tag selectByPrimaryKey(Integer id);

    List<TagVo> getTagsByArticleId(@Param("articleIds") List<Integer> articleIds);

    List<Tag> getHotTags(@Param("size") Integer size);


    int updateByPrimaryKeySelective(Tag record);

    int updateByPrimaryKey(Tag record);

}