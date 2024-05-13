package com.dao;

import com.entity.DanchexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DanchexinxiVO;
import com.entity.view.DanchexinxiView;


/**
 * 单车信息
 * 
 * @author 
 * @email 
 * @date 2021-03-09 10:59:37
 */
public interface DanchexinxiDao extends BaseMapper<DanchexinxiEntity> {
	
	List<DanchexinxiVO> selectListVO(@Param("ew") Wrapper<DanchexinxiEntity> wrapper);
	
	DanchexinxiVO selectVO(@Param("ew") Wrapper<DanchexinxiEntity> wrapper);
	
	List<DanchexinxiView> selectListView(@Param("ew") Wrapper<DanchexinxiEntity> wrapper);

	List<DanchexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DanchexinxiEntity> wrapper);
	
	DanchexinxiView selectView(@Param("ew") Wrapper<DanchexinxiEntity> wrapper);
	
}
