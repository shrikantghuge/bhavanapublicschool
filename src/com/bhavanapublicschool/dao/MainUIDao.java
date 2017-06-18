package com.bhavanapublicschool.dao;

import java.sql.SQLException;
import java.util.List;

import com.bhavanapublicschool.bean.Facilities;
import com.bhavanapublicschool.bean.GalleryBean;
import com.bhavanapublicschool.bean.NewsAndEventBean;

public interface MainUIDao {
	public List<GalleryBean> getSliderImages() throws SQLException;
	public boolean saveAdmissionEnquiryDetails() throws SQLException;
	public List<Facilities> getExtraCurricularActivities() throws SQLException;
	public List<Facilities> getFacilities() throws SQLException;
	public List<NewsAndEventBean> getNewsEvents() throws SQLException;
}
