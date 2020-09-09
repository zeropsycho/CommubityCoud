package com.zero.hjy.dao;

import com.zero.hjy.entity.Residence;

/**
 * @author ZERO
 * @since 2020-09-05
 */
public interface ResidenceMapper {

    Integer checkCompanyNo(String residenceNo);

    Integer newResidence(Residence residence);
}
