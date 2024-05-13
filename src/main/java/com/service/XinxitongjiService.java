package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XinxitongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XinxitongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XinxitongjiView;


/**
 * 信息统计
 *
 * @author 
 * @email 
 * @date 2021-03-09 10:59:37
 */
public interface XinxitongjiService extends IService<XinxitongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinxitongjiVO> selectListVO(Wrapper<XinxitongjiEntity> wrapper);
   	
   	XinxitongjiVO selectVO(@Param("ew") Wrapper<XinxitongjiEntity> wrapper);
   	
   	List<XinxitongjiView> selectListView(Wrapper<XinxitongjiEntity> wrapper);
   	
   	XinxitongjiView selectView(@Param("ew") Wrapper<XinxitongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinxitongjiEntity> wrapper);
   	
}

