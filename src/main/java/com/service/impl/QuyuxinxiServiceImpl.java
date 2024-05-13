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


import com.dao.QuyuxinxiDao;
import com.entity.QuyuxinxiEntity;
import com.service.QuyuxinxiService;
import com.entity.vo.QuyuxinxiVO;
import com.entity.view.QuyuxinxiView;

@Service("quyuxinxiService")
public class QuyuxinxiServiceImpl extends ServiceImpl<QuyuxinxiDao, QuyuxinxiEntity> implements QuyuxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QuyuxinxiEntity> page = this.selectPage(
                new Query<QuyuxinxiEntity>(params).getPage(),
                new EntityWrapper<QuyuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QuyuxinxiEntity> wrapper) {
		  Page<QuyuxinxiView> page =new Query<QuyuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QuyuxinxiVO> selectListVO(Wrapper<QuyuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QuyuxinxiVO selectVO(Wrapper<QuyuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QuyuxinxiView> selectListView(Wrapper<QuyuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QuyuxinxiView selectView(Wrapper<QuyuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
