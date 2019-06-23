package com.china.HealthHut.service.impl;

import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.china.HealthHut.pojo.Drugdetail;
import com.china.HealthHut.service.DrugdetailService;

@Service
public class DrugdetailServiceImpl  implements DrugdetailService  {

	@Override
	public List<Drugdetail> findDrugdetailList(int page, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Drugdetail findDrugdetailById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteDrugdetail(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int createDrugdetail(Drugdetail drugdetail) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int findDrugdetailAll() {
		// TODO Auto-generated method stub
		return 0;
	}
	/*
	 * @Autowired private DrugdetailMapper drugdetailMapper;
	 * 
	 * //分页查询Drugdetail
	 * 
	 * @Override public List<Drugdetail> findDrugdetailList(int page , int limit) {
	 * List<Drugdetail> DrugdetailList =
	 * this.drugdetailMapper.findDrugdetailList(new RowBounds(page, limit)); return
	 * DrugdetailList; }
	 * 
	 * //根据id查找Drugdetail
	 * 
	 * @Override public Drugdetail findDrugdetailById(int id) { Drugdetail
	 * Drugdetail = this.drugdetailMapper.findDrugdetailById(id); return Drugdetail;
	 * }
	 * 
	 * //根据id删除Drugdetail
	 * 
	 * @Override public int deleteDrugdetail(int id) { return
	 * this.drugdetailMapper.deleteDrugdetail(id); }
	 * 
	 * //新增Drugdetail
	 * 
	 * @Override public int createDrugdetail(Drugdetail caseReord) {
	 * 
	 * return this.drugdetailMapper.createDrugdetail(caseReord); }
	 * 
	 * //获得Drugdetail数据页数
	 * 
	 * @Override public int findDrugdetailAll() { List<Drugdetail> Drugdetails =
	 * this.drugdetailMapper.findDrugdetailAll(); int yeshu = Drugdetails.size()/9;
	 * if (Drugdetails.size()%9>0) { yeshu++; } return yeshu; }
	 */
}
