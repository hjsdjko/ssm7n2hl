package com.dao;

import com.entity.HaichedingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HaichedingdanVO;
import com.entity.view.HaichedingdanView;


/**
 * 还车订单
 * 
 * @author 
 * @email 
 * @date 2021-03-09 10:59:37
 */
public interface HaichedingdanDao extends BaseMapper<HaichedingdanEntity> {
	
	List<HaichedingdanVO> selectListVO(@Param("ew") Wrapper<HaichedingdanEntity> wrapper);
	
	HaichedingdanVO selectVO(@Param("ew") Wrapper<HaichedingdanEntity> wrapper);
	
	List<HaichedingdanView> selectListView(@Param("ew") Wrapper<HaichedingdanEntity> wrapper);

	List<HaichedingdanView> selectListView(Pagination page,@Param("ew") Wrapper<HaichedingdanEntity> wrapper);
	
	HaichedingdanView selectView(@Param("ew") Wrapper<HaichedingdanEntity> wrapper);
	
}
