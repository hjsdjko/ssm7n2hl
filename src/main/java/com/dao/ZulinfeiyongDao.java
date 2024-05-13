package com.dao;

import com.entity.ZulinfeiyongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZulinfeiyongVO;
import com.entity.view.ZulinfeiyongView;


/**
 * 租赁费用
 * 
 * @author 
 * @email 
 * @date 2021-03-09 10:59:37
 */
public interface ZulinfeiyongDao extends BaseMapper<ZulinfeiyongEntity> {
	
	List<ZulinfeiyongVO> selectListVO(@Param("ew") Wrapper<ZulinfeiyongEntity> wrapper);
	
	ZulinfeiyongVO selectVO(@Param("ew") Wrapper<ZulinfeiyongEntity> wrapper);
	
	List<ZulinfeiyongView> selectListView(@Param("ew") Wrapper<ZulinfeiyongEntity> wrapper);

	List<ZulinfeiyongView> selectListView(Pagination page,@Param("ew") Wrapper<ZulinfeiyongEntity> wrapper);
	
	ZulinfeiyongView selectView(@Param("ew") Wrapper<ZulinfeiyongEntity> wrapper);
	
}
