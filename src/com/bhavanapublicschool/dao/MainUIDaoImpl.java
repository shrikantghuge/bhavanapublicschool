package com.bhavanapublicschool.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.bhavanapublicschool.bean.Facilities;
import com.bhavanapublicschool.bean.GalleryBean;
import com.bhavanapublicschool.bean.NewsAndEventBean;

public class MainUIDaoImpl implements MainUIDao{

    private JdbcTemplate jdbcTemplate;
    static Logger LOGGER = Logger.getLogger(MainUIDaoImpl.class);
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

	
	@Override
	public List<GalleryBean> getSliderImages() throws SQLException {
		SqlRowSet result = jdbcTemplate.queryForRowSet("select * form where type=\"SLIDER\"");
		
		LOGGER.info("The size of result list is "+result);
		return null;
	}

	@Override
	public boolean saveAdmissionEnquiryDetails() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Facilities> getExtraCurricularActivities() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Facilities> getFacilities() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NewsAndEventBean> getNewsEvents() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
