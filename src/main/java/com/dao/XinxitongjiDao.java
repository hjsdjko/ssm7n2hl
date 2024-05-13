package com.dao;

import com.entity.XinxitongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XinxitongjiVO;
import com.entity.view.XinxitongjiView;


/**
 * 信息统计
 * 
 * @author 
 * @email 
 * @date 2021-03-09 10:59:37
 */
public interface XinxitongjiDao extends BaseMapper<XinxitongjiEntity> {
	
	List<XinxitongjiVO> selectListVO(@Param("ew") Wrapper<XinxitongjiEntity> wrapper);
	
	XinxitongjiVO selectVO(@Param("ew") Wrapper<XinxitongjiEntity> wrapper);
	
	List<XinxitongjiView> selectListView(@Param("ew") Wrapper<XinxitongjiEntity> wrapper);

	List<XinxitongjiView> selectListView(Pagination page,@Param("ew") Wrapper<XinxitongjiEntity> wrapper);
	
	XinxitongjiView selectView(@Param("ew") Wrapper<XinxitongjiEntity> wrapper);
	
}
