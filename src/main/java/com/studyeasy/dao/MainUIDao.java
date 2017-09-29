package com.studyeasy.dao;

import java.sql.SQLException;
import java.util.List;

import com.studyeasy.bean.Facilities;
import com.studyeasy.bean.GalleryBean;
import com.studyeasy.bean.NewsAndEventBean;

public interface MainUIDao {
	public List<GalleryBean> getSliderImages() throws SQLException;
	public boolean saveAdmissionEnquiryDetails() throws SQLException;
	public List<Facilities> getExtraCurricularActivities() throws SQLException;
	public List<Facilities> getFacilities() throws SQLException;
	public List<NewsAndEventBean> getNewsEvents() throws SQLException;
}
