package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DanchexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DanchexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DanchexinxiView;


/**
 * 单车信息
 *
 * @author 
 * @email 
 * @date 2021-03-09 10:59:37
 */
public interface DanchexinxiService extends IService<DanchexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DanchexinxiVO> selectListVO(Wrapper<DanchexinxiEntity> wrapper);
   	
   	DanchexinxiVO selectVO(@Param("ew") Wrapper<DanchexinxiEntity> wrapper);
   	
   	List<DanchexinxiView> selectListView(Wrapper<DanchexinxiEntity> wrapper);
   	
   	DanchexinxiView selectView(@Param("ew") Wrapper<DanchexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DanchexinxiEntity> wrapper);
   	
}

