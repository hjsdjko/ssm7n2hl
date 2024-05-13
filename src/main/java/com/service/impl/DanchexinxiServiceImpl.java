package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DanchexinxiDao;
import com.entity.DanchexinxiEntity;
import com.service.DanchexinxiService;
import com.entity.vo.DanchexinxiVO;
import com.entity.view.DanchexinxiView;

@Service("danchexinxiService")
public class DanchexinxiServiceImpl extends ServiceImpl<DanchexinxiDao, DanchexinxiEntity> implements DanchexinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DanchexinxiEntity> page = this.selectPage(
                new Query<DanchexinxiEntity>(params).getPage(),
                new EntityWrapper<DanchexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DanchexinxiEntity> wrapper) {
		  Page<DanchexinxiView> page =new Query<DanchexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DanchexinxiVO> selectListVO(Wrapper<DanchexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DanchexinxiVO selectVO(Wrapper<DanchexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DanchexinxiView> selectListView(Wrapper<DanchexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DanchexinxiView selectView(Wrapper<DanchexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
