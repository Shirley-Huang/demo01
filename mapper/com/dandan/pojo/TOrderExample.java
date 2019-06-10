package com.dandan.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TOrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNull() {
            addCriterion("order_number is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNotNull() {
            addCriterion("order_number is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberEqualTo(String value) {
            addCriterion("order_number =", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotEqualTo(String value) {
            addCriterion("order_number <>", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThan(String value) {
            addCriterion("order_number >", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThanOrEqualTo(String value) {
            addCriterion("order_number >=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThan(String value) {
            addCriterion("order_number <", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThanOrEqualTo(String value) {
            addCriterion("order_number <=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLike(String value) {
            addCriterion("order_number like", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotLike(String value) {
            addCriterion("order_number not like", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIn(List<String> values) {
            addCriterion("order_number in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotIn(List<String> values) {
            addCriterion("order_number not in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberBetween(String value1, String value2) {
            addCriterion("order_number between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotBetween(String value1, String value2) {
            addCriterion("order_number not between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andPartnerOrderNumberIsNull() {
            addCriterion("partner_order_number is null");
            return (Criteria) this;
        }

        public Criteria andPartnerOrderNumberIsNotNull() {
            addCriterion("partner_order_number is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerOrderNumberEqualTo(String value) {
            addCriterion("partner_order_number =", value, "partnerOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPartnerOrderNumberNotEqualTo(String value) {
            addCriterion("partner_order_number <>", value, "partnerOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPartnerOrderNumberGreaterThan(String value) {
            addCriterion("partner_order_number >", value, "partnerOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPartnerOrderNumberGreaterThanOrEqualTo(String value) {
            addCriterion("partner_order_number >=", value, "partnerOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPartnerOrderNumberLessThan(String value) {
            addCriterion("partner_order_number <", value, "partnerOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPartnerOrderNumberLessThanOrEqualTo(String value) {
            addCriterion("partner_order_number <=", value, "partnerOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPartnerOrderNumberLike(String value) {
            addCriterion("partner_order_number like", value, "partnerOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPartnerOrderNumberNotLike(String value) {
            addCriterion("partner_order_number not like", value, "partnerOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPartnerOrderNumberIn(List<String> values) {
            addCriterion("partner_order_number in", values, "partnerOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPartnerOrderNumberNotIn(List<String> values) {
            addCriterion("partner_order_number not in", values, "partnerOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPartnerOrderNumberBetween(String value1, String value2) {
            addCriterion("partner_order_number between", value1, value2, "partnerOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPartnerOrderNumberNotBetween(String value1, String value2) {
            addCriterion("partner_order_number not between", value1, value2, "partnerOrderNumber");
            return (Criteria) this;
        }

        public Criteria andUserExpectDateIsNull() {
            addCriterion("user_expect_date is null");
            return (Criteria) this;
        }

        public Criteria andUserExpectDateIsNotNull() {
            addCriterion("user_expect_date is not null");
            return (Criteria) this;
        }

        public Criteria andUserExpectDateEqualTo(Date value) {
            addCriterionForJDBCDate("user_expect_date =", value, "userExpectDate");
            return (Criteria) this;
        }

        public Criteria andUserExpectDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("user_expect_date <>", value, "userExpectDate");
            return (Criteria) this;
        }

        public Criteria andUserExpectDateGreaterThan(Date value) {
            addCriterionForJDBCDate("user_expect_date >", value, "userExpectDate");
            return (Criteria) this;
        }

        public Criteria andUserExpectDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_expect_date >=", value, "userExpectDate");
            return (Criteria) this;
        }

        public Criteria andUserExpectDateLessThan(Date value) {
            addCriterionForJDBCDate("user_expect_date <", value, "userExpectDate");
            return (Criteria) this;
        }

        public Criteria andUserExpectDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_expect_date <=", value, "userExpectDate");
            return (Criteria) this;
        }

        public Criteria andUserExpectDateIn(List<Date> values) {
            addCriterionForJDBCDate("user_expect_date in", values, "userExpectDate");
            return (Criteria) this;
        }

        public Criteria andUserExpectDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("user_expect_date not in", values, "userExpectDate");
            return (Criteria) this;
        }

        public Criteria andUserExpectDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_expect_date between", value1, value2, "userExpectDate");
            return (Criteria) this;
        }

        public Criteria andUserExpectDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_expect_date not between", value1, value2, "userExpectDate");
            return (Criteria) this;
        }

        public Criteria andUserExpectTimeSoltIdIsNull() {
            addCriterion("user_expect_time_solt_id is null");
            return (Criteria) this;
        }

        public Criteria andUserExpectTimeSoltIdIsNotNull() {
            addCriterion("user_expect_time_solt_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserExpectTimeSoltIdEqualTo(Integer value) {
            addCriterion("user_expect_time_solt_id =", value, "userExpectTimeSoltId");
            return (Criteria) this;
        }

        public Criteria andUserExpectTimeSoltIdNotEqualTo(Integer value) {
            addCriterion("user_expect_time_solt_id <>", value, "userExpectTimeSoltId");
            return (Criteria) this;
        }

        public Criteria andUserExpectTimeSoltIdGreaterThan(Integer value) {
            addCriterion("user_expect_time_solt_id >", value, "userExpectTimeSoltId");
            return (Criteria) this;
        }

        public Criteria andUserExpectTimeSoltIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_expect_time_solt_id >=", value, "userExpectTimeSoltId");
            return (Criteria) this;
        }

        public Criteria andUserExpectTimeSoltIdLessThan(Integer value) {
            addCriterion("user_expect_time_solt_id <", value, "userExpectTimeSoltId");
            return (Criteria) this;
        }

        public Criteria andUserExpectTimeSoltIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_expect_time_solt_id <=", value, "userExpectTimeSoltId");
            return (Criteria) this;
        }

        public Criteria andUserExpectTimeSoltIdIn(List<Integer> values) {
            addCriterion("user_expect_time_solt_id in", values, "userExpectTimeSoltId");
            return (Criteria) this;
        }

        public Criteria andUserExpectTimeSoltIdNotIn(List<Integer> values) {
            addCriterion("user_expect_time_solt_id not in", values, "userExpectTimeSoltId");
            return (Criteria) this;
        }

        public Criteria andUserExpectTimeSoltIdBetween(Integer value1, Integer value2) {
            addCriterion("user_expect_time_solt_id between", value1, value2, "userExpectTimeSoltId");
            return (Criteria) this;
        }

        public Criteria andUserExpectTimeSoltIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_expect_time_solt_id not between", value1, value2, "userExpectTimeSoltId");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeDateIsNull() {
            addCriterion("final_agree_date is null");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeDateIsNotNull() {
            addCriterion("final_agree_date is not null");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeDateEqualTo(Date value) {
            addCriterionForJDBCDate("final_agree_date =", value, "finalAgreeDate");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("final_agree_date <>", value, "finalAgreeDate");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeDateGreaterThan(Date value) {
            addCriterionForJDBCDate("final_agree_date >", value, "finalAgreeDate");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("final_agree_date >=", value, "finalAgreeDate");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeDateLessThan(Date value) {
            addCriterionForJDBCDate("final_agree_date <", value, "finalAgreeDate");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("final_agree_date <=", value, "finalAgreeDate");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeDateIn(List<Date> values) {
            addCriterionForJDBCDate("final_agree_date in", values, "finalAgreeDate");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("final_agree_date not in", values, "finalAgreeDate");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("final_agree_date between", value1, value2, "finalAgreeDate");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("final_agree_date not between", value1, value2, "finalAgreeDate");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeTimeSoltIdIsNull() {
            addCriterion("final_agree_time_solt_id is null");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeTimeSoltIdIsNotNull() {
            addCriterion("final_agree_time_solt_id is not null");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeTimeSoltIdEqualTo(Integer value) {
            addCriterion("final_agree_time_solt_id =", value, "finalAgreeTimeSoltId");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeTimeSoltIdNotEqualTo(Integer value) {
            addCriterion("final_agree_time_solt_id <>", value, "finalAgreeTimeSoltId");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeTimeSoltIdGreaterThan(Integer value) {
            addCriterion("final_agree_time_solt_id >", value, "finalAgreeTimeSoltId");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeTimeSoltIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("final_agree_time_solt_id >=", value, "finalAgreeTimeSoltId");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeTimeSoltIdLessThan(Integer value) {
            addCriterion("final_agree_time_solt_id <", value, "finalAgreeTimeSoltId");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeTimeSoltIdLessThanOrEqualTo(Integer value) {
            addCriterion("final_agree_time_solt_id <=", value, "finalAgreeTimeSoltId");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeTimeSoltIdIn(List<Integer> values) {
            addCriterion("final_agree_time_solt_id in", values, "finalAgreeTimeSoltId");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeTimeSoltIdNotIn(List<Integer> values) {
            addCriterion("final_agree_time_solt_id not in", values, "finalAgreeTimeSoltId");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeTimeSoltIdBetween(Integer value1, Integer value2) {
            addCriterion("final_agree_time_solt_id between", value1, value2, "finalAgreeTimeSoltId");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeTimeSoltIdNotBetween(Integer value1, Integer value2) {
            addCriterion("final_agree_time_solt_id not between", value1, value2, "finalAgreeTimeSoltId");
            return (Criteria) this;
        }

        public Criteria andArtisanNameIsNull() {
            addCriterion("artisan_name is null");
            return (Criteria) this;
        }

        public Criteria andArtisanNameIsNotNull() {
            addCriterion("artisan_name is not null");
            return (Criteria) this;
        }

        public Criteria andArtisanNameEqualTo(String value) {
            addCriterion("artisan_name =", value, "artisanName");
            return (Criteria) this;
        }

        public Criteria andArtisanNameNotEqualTo(String value) {
            addCriterion("artisan_name <>", value, "artisanName");
            return (Criteria) this;
        }

        public Criteria andArtisanNameGreaterThan(String value) {
            addCriterion("artisan_name >", value, "artisanName");
            return (Criteria) this;
        }

        public Criteria andArtisanNameGreaterThanOrEqualTo(String value) {
            addCriterion("artisan_name >=", value, "artisanName");
            return (Criteria) this;
        }

        public Criteria andArtisanNameLessThan(String value) {
            addCriterion("artisan_name <", value, "artisanName");
            return (Criteria) this;
        }

        public Criteria andArtisanNameLessThanOrEqualTo(String value) {
            addCriterion("artisan_name <=", value, "artisanName");
            return (Criteria) this;
        }

        public Criteria andArtisanNameLike(String value) {
            addCriterion("artisan_name like", value, "artisanName");
            return (Criteria) this;
        }

        public Criteria andArtisanNameNotLike(String value) {
            addCriterion("artisan_name not like", value, "artisanName");
            return (Criteria) this;
        }

        public Criteria andArtisanNameIn(List<String> values) {
            addCriterion("artisan_name in", values, "artisanName");
            return (Criteria) this;
        }

        public Criteria andArtisanNameNotIn(List<String> values) {
            addCriterion("artisan_name not in", values, "artisanName");
            return (Criteria) this;
        }

        public Criteria andArtisanNameBetween(String value1, String value2) {
            addCriterion("artisan_name between", value1, value2, "artisanName");
            return (Criteria) this;
        }

        public Criteria andArtisanNameNotBetween(String value1, String value2) {
            addCriterion("artisan_name not between", value1, value2, "artisanName");
            return (Criteria) this;
        }

        public Criteria andArtisanMobileIsNull() {
            addCriterion("artisan_mobile is null");
            return (Criteria) this;
        }

        public Criteria andArtisanMobileIsNotNull() {
            addCriterion("artisan_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andArtisanMobileEqualTo(String value) {
            addCriterion("artisan_mobile =", value, "artisanMobile");
            return (Criteria) this;
        }

        public Criteria andArtisanMobileNotEqualTo(String value) {
            addCriterion("artisan_mobile <>", value, "artisanMobile");
            return (Criteria) this;
        }

        public Criteria andArtisanMobileGreaterThan(String value) {
            addCriterion("artisan_mobile >", value, "artisanMobile");
            return (Criteria) this;
        }

        public Criteria andArtisanMobileGreaterThanOrEqualTo(String value) {
            addCriterion("artisan_mobile >=", value, "artisanMobile");
            return (Criteria) this;
        }

        public Criteria andArtisanMobileLessThan(String value) {
            addCriterion("artisan_mobile <", value, "artisanMobile");
            return (Criteria) this;
        }

        public Criteria andArtisanMobileLessThanOrEqualTo(String value) {
            addCriterion("artisan_mobile <=", value, "artisanMobile");
            return (Criteria) this;
        }

        public Criteria andArtisanMobileLike(String value) {
            addCriterion("artisan_mobile like", value, "artisanMobile");
            return (Criteria) this;
        }

        public Criteria andArtisanMobileNotLike(String value) {
            addCriterion("artisan_mobile not like", value, "artisanMobile");
            return (Criteria) this;
        }

        public Criteria andArtisanMobileIn(List<String> values) {
            addCriterion("artisan_mobile in", values, "artisanMobile");
            return (Criteria) this;
        }

        public Criteria andArtisanMobileNotIn(List<String> values) {
            addCriterion("artisan_mobile not in", values, "artisanMobile");
            return (Criteria) this;
        }

        public Criteria andArtisanMobileBetween(String value1, String value2) {
            addCriterion("artisan_mobile between", value1, value2, "artisanMobile");
            return (Criteria) this;
        }

        public Criteria andArtisanMobileNotBetween(String value1, String value2) {
            addCriterion("artisan_mobile not between", value1, value2, "artisanMobile");
            return (Criteria) this;
        }

        public Criteria andArtisanAddressIsNull() {
            addCriterion("artisan_address is null");
            return (Criteria) this;
        }

        public Criteria andArtisanAddressIsNotNull() {
            addCriterion("artisan_address is not null");
            return (Criteria) this;
        }

        public Criteria andArtisanAddressEqualTo(String value) {
            addCriterion("artisan_address =", value, "artisanAddress");
            return (Criteria) this;
        }

        public Criteria andArtisanAddressNotEqualTo(String value) {
            addCriterion("artisan_address <>", value, "artisanAddress");
            return (Criteria) this;
        }

        public Criteria andArtisanAddressGreaterThan(String value) {
            addCriterion("artisan_address >", value, "artisanAddress");
            return (Criteria) this;
        }

        public Criteria andArtisanAddressGreaterThanOrEqualTo(String value) {
            addCriterion("artisan_address >=", value, "artisanAddress");
            return (Criteria) this;
        }

        public Criteria andArtisanAddressLessThan(String value) {
            addCriterion("artisan_address <", value, "artisanAddress");
            return (Criteria) this;
        }

        public Criteria andArtisanAddressLessThanOrEqualTo(String value) {
            addCriterion("artisan_address <=", value, "artisanAddress");
            return (Criteria) this;
        }

        public Criteria andArtisanAddressLike(String value) {
            addCriterion("artisan_address like", value, "artisanAddress");
            return (Criteria) this;
        }

        public Criteria andArtisanAddressNotLike(String value) {
            addCriterion("artisan_address not like", value, "artisanAddress");
            return (Criteria) this;
        }

        public Criteria andArtisanAddressIn(List<String> values) {
            addCriterion("artisan_address in", values, "artisanAddress");
            return (Criteria) this;
        }

        public Criteria andArtisanAddressNotIn(List<String> values) {
            addCriterion("artisan_address not in", values, "artisanAddress");
            return (Criteria) this;
        }

        public Criteria andArtisanAddressBetween(String value1, String value2) {
            addCriterion("artisan_address between", value1, value2, "artisanAddress");
            return (Criteria) this;
        }

        public Criteria andArtisanAddressNotBetween(String value1, String value2) {
            addCriterion("artisan_address not between", value1, value2, "artisanAddress");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIsNull() {
            addCriterion("merchant_name is null");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIsNotNull() {
            addCriterion("merchant_name is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantNameEqualTo(String value) {
            addCriterion("merchant_name =", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotEqualTo(String value) {
            addCriterion("merchant_name <>", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameGreaterThan(String value) {
            addCriterion("merchant_name >", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_name >=", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLessThan(String value) {
            addCriterion("merchant_name <", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLessThanOrEqualTo(String value) {
            addCriterion("merchant_name <=", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLike(String value) {
            addCriterion("merchant_name like", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotLike(String value) {
            addCriterion("merchant_name not like", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIn(List<String> values) {
            addCriterion("merchant_name in", values, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotIn(List<String> values) {
            addCriterion("merchant_name not in", values, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameBetween(String value1, String value2) {
            addCriterion("merchant_name between", value1, value2, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotBetween(String value1, String value2) {
            addCriterion("merchant_name not between", value1, value2, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantContactNameIsNull() {
            addCriterion("merchant_contact_name is null");
            return (Criteria) this;
        }

        public Criteria andMerchantContactNameIsNotNull() {
            addCriterion("merchant_contact_name is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantContactNameEqualTo(String value) {
            addCriterion("merchant_contact_name =", value, "merchantContactName");
            return (Criteria) this;
        }

        public Criteria andMerchantContactNameNotEqualTo(String value) {
            addCriterion("merchant_contact_name <>", value, "merchantContactName");
            return (Criteria) this;
        }

        public Criteria andMerchantContactNameGreaterThan(String value) {
            addCriterion("merchant_contact_name >", value, "merchantContactName");
            return (Criteria) this;
        }

        public Criteria andMerchantContactNameGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_contact_name >=", value, "merchantContactName");
            return (Criteria) this;
        }

        public Criteria andMerchantContactNameLessThan(String value) {
            addCriterion("merchant_contact_name <", value, "merchantContactName");
            return (Criteria) this;
        }

        public Criteria andMerchantContactNameLessThanOrEqualTo(String value) {
            addCriterion("merchant_contact_name <=", value, "merchantContactName");
            return (Criteria) this;
        }

        public Criteria andMerchantContactNameLike(String value) {
            addCriterion("merchant_contact_name like", value, "merchantContactName");
            return (Criteria) this;
        }

        public Criteria andMerchantContactNameNotLike(String value) {
            addCriterion("merchant_contact_name not like", value, "merchantContactName");
            return (Criteria) this;
        }

        public Criteria andMerchantContactNameIn(List<String> values) {
            addCriterion("merchant_contact_name in", values, "merchantContactName");
            return (Criteria) this;
        }

        public Criteria andMerchantContactNameNotIn(List<String> values) {
            addCriterion("merchant_contact_name not in", values, "merchantContactName");
            return (Criteria) this;
        }

        public Criteria andMerchantContactNameBetween(String value1, String value2) {
            addCriterion("merchant_contact_name between", value1, value2, "merchantContactName");
            return (Criteria) this;
        }

        public Criteria andMerchantContactNameNotBetween(String value1, String value2) {
            addCriterion("merchant_contact_name not between", value1, value2, "merchantContactName");
            return (Criteria) this;
        }

        public Criteria andMerchantContactPhoneNumberIsNull() {
            addCriterion("merchant_contact_phone_number is null");
            return (Criteria) this;
        }

        public Criteria andMerchantContactPhoneNumberIsNotNull() {
            addCriterion("merchant_contact_phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantContactPhoneNumberEqualTo(String value) {
            addCriterion("merchant_contact_phone_number =", value, "merchantContactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMerchantContactPhoneNumberNotEqualTo(String value) {
            addCriterion("merchant_contact_phone_number <>", value, "merchantContactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMerchantContactPhoneNumberGreaterThan(String value) {
            addCriterion("merchant_contact_phone_number >", value, "merchantContactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMerchantContactPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_contact_phone_number >=", value, "merchantContactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMerchantContactPhoneNumberLessThan(String value) {
            addCriterion("merchant_contact_phone_number <", value, "merchantContactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMerchantContactPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("merchant_contact_phone_number <=", value, "merchantContactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMerchantContactPhoneNumberLike(String value) {
            addCriterion("merchant_contact_phone_number like", value, "merchantContactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMerchantContactPhoneNumberNotLike(String value) {
            addCriterion("merchant_contact_phone_number not like", value, "merchantContactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMerchantContactPhoneNumberIn(List<String> values) {
            addCriterion("merchant_contact_phone_number in", values, "merchantContactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMerchantContactPhoneNumberNotIn(List<String> values) {
            addCriterion("merchant_contact_phone_number not in", values, "merchantContactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMerchantContactPhoneNumberBetween(String value1, String value2) {
            addCriterion("merchant_contact_phone_number between", value1, value2, "merchantContactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMerchantContactPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("merchant_contact_phone_number not between", value1, value2, "merchantContactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andIsAuthenticationMerchantOrderIsNull() {
            addCriterion("is_authentication_merchant_order is null");
            return (Criteria) this;
        }

        public Criteria andIsAuthenticationMerchantOrderIsNotNull() {
            addCriterion("is_authentication_merchant_order is not null");
            return (Criteria) this;
        }

        public Criteria andIsAuthenticationMerchantOrderEqualTo(String value) {
            addCriterion("is_authentication_merchant_order =", value, "isAuthenticationMerchantOrder");
            return (Criteria) this;
        }

        public Criteria andIsAuthenticationMerchantOrderNotEqualTo(String value) {
            addCriterion("is_authentication_merchant_order <>", value, "isAuthenticationMerchantOrder");
            return (Criteria) this;
        }

        public Criteria andIsAuthenticationMerchantOrderGreaterThan(String value) {
            addCriterion("is_authentication_merchant_order >", value, "isAuthenticationMerchantOrder");
            return (Criteria) this;
        }

        public Criteria andIsAuthenticationMerchantOrderGreaterThanOrEqualTo(String value) {
            addCriterion("is_authentication_merchant_order >=", value, "isAuthenticationMerchantOrder");
            return (Criteria) this;
        }

        public Criteria andIsAuthenticationMerchantOrderLessThan(String value) {
            addCriterion("is_authentication_merchant_order <", value, "isAuthenticationMerchantOrder");
            return (Criteria) this;
        }

        public Criteria andIsAuthenticationMerchantOrderLessThanOrEqualTo(String value) {
            addCriterion("is_authentication_merchant_order <=", value, "isAuthenticationMerchantOrder");
            return (Criteria) this;
        }

        public Criteria andIsAuthenticationMerchantOrderLike(String value) {
            addCriterion("is_authentication_merchant_order like", value, "isAuthenticationMerchantOrder");
            return (Criteria) this;
        }

        public Criteria andIsAuthenticationMerchantOrderNotLike(String value) {
            addCriterion("is_authentication_merchant_order not like", value, "isAuthenticationMerchantOrder");
            return (Criteria) this;
        }

        public Criteria andIsAuthenticationMerchantOrderIn(List<String> values) {
            addCriterion("is_authentication_merchant_order in", values, "isAuthenticationMerchantOrder");
            return (Criteria) this;
        }

        public Criteria andIsAuthenticationMerchantOrderNotIn(List<String> values) {
            addCriterion("is_authentication_merchant_order not in", values, "isAuthenticationMerchantOrder");
            return (Criteria) this;
        }

        public Criteria andIsAuthenticationMerchantOrderBetween(String value1, String value2) {
            addCriterion("is_authentication_merchant_order between", value1, value2, "isAuthenticationMerchantOrder");
            return (Criteria) this;
        }

        public Criteria andIsAuthenticationMerchantOrderNotBetween(String value1, String value2) {
            addCriterion("is_authentication_merchant_order not between", value1, value2, "isAuthenticationMerchantOrder");
            return (Criteria) this;
        }

        public Criteria andMerchantAuthenticationNameIsNull() {
            addCriterion("merchant_authentication_name is null");
            return (Criteria) this;
        }

        public Criteria andMerchantAuthenticationNameIsNotNull() {
            addCriterion("merchant_authentication_name is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantAuthenticationNameEqualTo(String value) {
            addCriterion("merchant_authentication_name =", value, "merchantAuthenticationName");
            return (Criteria) this;
        }

        public Criteria andMerchantAuthenticationNameNotEqualTo(String value) {
            addCriterion("merchant_authentication_name <>", value, "merchantAuthenticationName");
            return (Criteria) this;
        }

        public Criteria andMerchantAuthenticationNameGreaterThan(String value) {
            addCriterion("merchant_authentication_name >", value, "merchantAuthenticationName");
            return (Criteria) this;
        }

        public Criteria andMerchantAuthenticationNameGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_authentication_name >=", value, "merchantAuthenticationName");
            return (Criteria) this;
        }

        public Criteria andMerchantAuthenticationNameLessThan(String value) {
            addCriterion("merchant_authentication_name <", value, "merchantAuthenticationName");
            return (Criteria) this;
        }

        public Criteria andMerchantAuthenticationNameLessThanOrEqualTo(String value) {
            addCriterion("merchant_authentication_name <=", value, "merchantAuthenticationName");
            return (Criteria) this;
        }

        public Criteria andMerchantAuthenticationNameLike(String value) {
            addCriterion("merchant_authentication_name like", value, "merchantAuthenticationName");
            return (Criteria) this;
        }

        public Criteria andMerchantAuthenticationNameNotLike(String value) {
            addCriterion("merchant_authentication_name not like", value, "merchantAuthenticationName");
            return (Criteria) this;
        }

        public Criteria andMerchantAuthenticationNameIn(List<String> values) {
            addCriterion("merchant_authentication_name in", values, "merchantAuthenticationName");
            return (Criteria) this;
        }

        public Criteria andMerchantAuthenticationNameNotIn(List<String> values) {
            addCriterion("merchant_authentication_name not in", values, "merchantAuthenticationName");
            return (Criteria) this;
        }

        public Criteria andMerchantAuthenticationNameBetween(String value1, String value2) {
            addCriterion("merchant_authentication_name between", value1, value2, "merchantAuthenticationName");
            return (Criteria) this;
        }

        public Criteria andMerchantAuthenticationNameNotBetween(String value1, String value2) {
            addCriterion("merchant_authentication_name not between", value1, value2, "merchantAuthenticationName");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNull() {
            addCriterion("publish_time is null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNotNull() {
            addCriterion("publish_time is not null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeEqualTo(Date value) {
            addCriterion("publish_time =", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotEqualTo(Date value) {
            addCriterion("publish_time <>", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThan(Date value) {
            addCriterion("publish_time >", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("publish_time >=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThan(Date value) {
            addCriterion("publish_time <", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThanOrEqualTo(Date value) {
            addCriterion("publish_time <=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIn(List<Date> values) {
            addCriterion("publish_time in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotIn(List<Date> values) {
            addCriterion("publish_time not in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeBetween(Date value1, Date value2) {
            addCriterion("publish_time between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotBetween(Date value1, Date value2) {
            addCriterion("publish_time not between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andGrabingTimeIsNull() {
            addCriterion("grabing_time is null");
            return (Criteria) this;
        }

        public Criteria andGrabingTimeIsNotNull() {
            addCriterion("grabing_time is not null");
            return (Criteria) this;
        }

        public Criteria andGrabingTimeEqualTo(Date value) {
            addCriterion("grabing_time =", value, "grabingTime");
            return (Criteria) this;
        }

        public Criteria andGrabingTimeNotEqualTo(Date value) {
            addCriterion("grabing_time <>", value, "grabingTime");
            return (Criteria) this;
        }

        public Criteria andGrabingTimeGreaterThan(Date value) {
            addCriterion("grabing_time >", value, "grabingTime");
            return (Criteria) this;
        }

        public Criteria andGrabingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("grabing_time >=", value, "grabingTime");
            return (Criteria) this;
        }

        public Criteria andGrabingTimeLessThan(Date value) {
            addCriterion("grabing_time <", value, "grabingTime");
            return (Criteria) this;
        }

        public Criteria andGrabingTimeLessThanOrEqualTo(Date value) {
            addCriterion("grabing_time <=", value, "grabingTime");
            return (Criteria) this;
        }

        public Criteria andGrabingTimeIn(List<Date> values) {
            addCriterion("grabing_time in", values, "grabingTime");
            return (Criteria) this;
        }

        public Criteria andGrabingTimeNotIn(List<Date> values) {
            addCriterion("grabing_time not in", values, "grabingTime");
            return (Criteria) this;
        }

        public Criteria andGrabingTimeBetween(Date value1, Date value2) {
            addCriterion("grabing_time between", value1, value2, "grabingTime");
            return (Criteria) this;
        }

        public Criteria andGrabingTimeNotBetween(Date value1, Date value2) {
            addCriterion("grabing_time not between", value1, value2, "grabingTime");
            return (Criteria) this;
        }

        public Criteria andConfirmAddressTimeIsNull() {
            addCriterion("confirm_address_time is null");
            return (Criteria) this;
        }

        public Criteria andConfirmAddressTimeIsNotNull() {
            addCriterion("confirm_address_time is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmAddressTimeEqualTo(Date value) {
            addCriterion("confirm_address_time =", value, "confirmAddressTime");
            return (Criteria) this;
        }

        public Criteria andConfirmAddressTimeNotEqualTo(Date value) {
            addCriterion("confirm_address_time <>", value, "confirmAddressTime");
            return (Criteria) this;
        }

        public Criteria andConfirmAddressTimeGreaterThan(Date value) {
            addCriterion("confirm_address_time >", value, "confirmAddressTime");
            return (Criteria) this;
        }

        public Criteria andConfirmAddressTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("confirm_address_time >=", value, "confirmAddressTime");
            return (Criteria) this;
        }

        public Criteria andConfirmAddressTimeLessThan(Date value) {
            addCriterion("confirm_address_time <", value, "confirmAddressTime");
            return (Criteria) this;
        }

        public Criteria andConfirmAddressTimeLessThanOrEqualTo(Date value) {
            addCriterion("confirm_address_time <=", value, "confirmAddressTime");
            return (Criteria) this;
        }

        public Criteria andConfirmAddressTimeIn(List<Date> values) {
            addCriterion("confirm_address_time in", values, "confirmAddressTime");
            return (Criteria) this;
        }

        public Criteria andConfirmAddressTimeNotIn(List<Date> values) {
            addCriterion("confirm_address_time not in", values, "confirmAddressTime");
            return (Criteria) this;
        }

        public Criteria andConfirmAddressTimeBetween(Date value1, Date value2) {
            addCriterion("confirm_address_time between", value1, value2, "confirmAddressTime");
            return (Criteria) this;
        }

        public Criteria andConfirmAddressTimeNotBetween(Date value1, Date value2) {
            addCriterion("confirm_address_time not between", value1, value2, "confirmAddressTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeIsNull() {
            addCriterion("deliver_time is null");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeIsNotNull() {
            addCriterion("deliver_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeEqualTo(Date value) {
            addCriterion("deliver_time =", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeNotEqualTo(Date value) {
            addCriterion("deliver_time <>", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeGreaterThan(Date value) {
            addCriterion("deliver_time >", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("deliver_time >=", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeLessThan(Date value) {
            addCriterion("deliver_time <", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeLessThanOrEqualTo(Date value) {
            addCriterion("deliver_time <=", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeIn(List<Date> values) {
            addCriterion("deliver_time in", values, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeNotIn(List<Date> values) {
            addCriterion("deliver_time not in", values, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeBetween(Date value1, Date value2) {
            addCriterion("deliver_time between", value1, value2, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeNotBetween(Date value1, Date value2) {
            addCriterion("deliver_time not between", value1, value2, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNull() {
            addCriterion("receive_time is null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNotNull() {
            addCriterion("receive_time is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeEqualTo(Date value) {
            addCriterion("receive_time =", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotEqualTo(Date value) {
            addCriterion("receive_time <>", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThan(Date value) {
            addCriterion("receive_time >", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("receive_time >=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThan(Date value) {
            addCriterion("receive_time <", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("receive_time <=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIn(List<Date> values) {
            addCriterion("receive_time in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotIn(List<Date> values) {
            addCriterion("receive_time not in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeBetween(Date value1, Date value2) {
            addCriterion("receive_time between", value1, value2, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("receive_time not between", value1, value2, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andAssigningTimeIsNull() {
            addCriterion("assigning_time is null");
            return (Criteria) this;
        }

        public Criteria andAssigningTimeIsNotNull() {
            addCriterion("assigning_time is not null");
            return (Criteria) this;
        }

        public Criteria andAssigningTimeEqualTo(Date value) {
            addCriterion("assigning_time =", value, "assigningTime");
            return (Criteria) this;
        }

        public Criteria andAssigningTimeNotEqualTo(Date value) {
            addCriterion("assigning_time <>", value, "assigningTime");
            return (Criteria) this;
        }

        public Criteria andAssigningTimeGreaterThan(Date value) {
            addCriterion("assigning_time >", value, "assigningTime");
            return (Criteria) this;
        }

        public Criteria andAssigningTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("assigning_time >=", value, "assigningTime");
            return (Criteria) this;
        }

        public Criteria andAssigningTimeLessThan(Date value) {
            addCriterion("assigning_time <", value, "assigningTime");
            return (Criteria) this;
        }

        public Criteria andAssigningTimeLessThanOrEqualTo(Date value) {
            addCriterion("assigning_time <=", value, "assigningTime");
            return (Criteria) this;
        }

        public Criteria andAssigningTimeIn(List<Date> values) {
            addCriterion("assigning_time in", values, "assigningTime");
            return (Criteria) this;
        }

        public Criteria andAssigningTimeNotIn(List<Date> values) {
            addCriterion("assigning_time not in", values, "assigningTime");
            return (Criteria) this;
        }

        public Criteria andAssigningTimeBetween(Date value1, Date value2) {
            addCriterion("assigning_time between", value1, value2, "assigningTime");
            return (Criteria) this;
        }

        public Criteria andAssigningTimeNotBetween(Date value1, Date value2) {
            addCriterion("assigning_time not between", value1, value2, "assigningTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeIsNull() {
            addCriterion("sign_time is null");
            return (Criteria) this;
        }

        public Criteria andSignTimeIsNotNull() {
            addCriterion("sign_time is not null");
            return (Criteria) this;
        }

        public Criteria andSignTimeEqualTo(Date value) {
            addCriterion("sign_time =", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotEqualTo(Date value) {
            addCriterion("sign_time <>", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeGreaterThan(Date value) {
            addCriterion("sign_time >", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sign_time >=", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLessThan(Date value) {
            addCriterion("sign_time <", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLessThanOrEqualTo(Date value) {
            addCriterion("sign_time <=", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeIn(List<Date> values) {
            addCriterion("sign_time in", values, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotIn(List<Date> values) {
            addCriterion("sign_time not in", values, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeBetween(Date value1, Date value2) {
            addCriterion("sign_time between", value1, value2, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotBetween(Date value1, Date value2) {
            addCriterion("sign_time not between", value1, value2, "signTime");
            return (Criteria) this;
        }

        public Criteria andServingCompletedTimeIsNull() {
            addCriterion("serving_completed_time is null");
            return (Criteria) this;
        }

        public Criteria andServingCompletedTimeIsNotNull() {
            addCriterion("serving_completed_time is not null");
            return (Criteria) this;
        }

        public Criteria andServingCompletedTimeEqualTo(Date value) {
            addCriterion("serving_completed_time =", value, "servingCompletedTime");
            return (Criteria) this;
        }

        public Criteria andServingCompletedTimeNotEqualTo(Date value) {
            addCriterion("serving_completed_time <>", value, "servingCompletedTime");
            return (Criteria) this;
        }

        public Criteria andServingCompletedTimeGreaterThan(Date value) {
            addCriterion("serving_completed_time >", value, "servingCompletedTime");
            return (Criteria) this;
        }

        public Criteria andServingCompletedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("serving_completed_time >=", value, "servingCompletedTime");
            return (Criteria) this;
        }

        public Criteria andServingCompletedTimeLessThan(Date value) {
            addCriterion("serving_completed_time <", value, "servingCompletedTime");
            return (Criteria) this;
        }

        public Criteria andServingCompletedTimeLessThanOrEqualTo(Date value) {
            addCriterion("serving_completed_time <=", value, "servingCompletedTime");
            return (Criteria) this;
        }

        public Criteria andServingCompletedTimeIn(List<Date> values) {
            addCriterion("serving_completed_time in", values, "servingCompletedTime");
            return (Criteria) this;
        }

        public Criteria andServingCompletedTimeNotIn(List<Date> values) {
            addCriterion("serving_completed_time not in", values, "servingCompletedTime");
            return (Criteria) this;
        }

        public Criteria andServingCompletedTimeBetween(Date value1, Date value2) {
            addCriterion("serving_completed_time between", value1, value2, "servingCompletedTime");
            return (Criteria) this;
        }

        public Criteria andServingCompletedTimeNotBetween(Date value1, Date value2) {
            addCriterion("serving_completed_time not between", value1, value2, "servingCompletedTime");
            return (Criteria) this;
        }

        public Criteria andCustomerAcceptanceTimeIsNull() {
            addCriterion("customer_acceptance_time is null");
            return (Criteria) this;
        }

        public Criteria andCustomerAcceptanceTimeIsNotNull() {
            addCriterion("customer_acceptance_time is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerAcceptanceTimeEqualTo(Date value) {
            addCriterion("customer_acceptance_time =", value, "customerAcceptanceTime");
            return (Criteria) this;
        }

        public Criteria andCustomerAcceptanceTimeNotEqualTo(Date value) {
            addCriterion("customer_acceptance_time <>", value, "customerAcceptanceTime");
            return (Criteria) this;
        }

        public Criteria andCustomerAcceptanceTimeGreaterThan(Date value) {
            addCriterion("customer_acceptance_time >", value, "customerAcceptanceTime");
            return (Criteria) this;
        }

        public Criteria andCustomerAcceptanceTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("customer_acceptance_time >=", value, "customerAcceptanceTime");
            return (Criteria) this;
        }

        public Criteria andCustomerAcceptanceTimeLessThan(Date value) {
            addCriterion("customer_acceptance_time <", value, "customerAcceptanceTime");
            return (Criteria) this;
        }

        public Criteria andCustomerAcceptanceTimeLessThanOrEqualTo(Date value) {
            addCriterion("customer_acceptance_time <=", value, "customerAcceptanceTime");
            return (Criteria) this;
        }

        public Criteria andCustomerAcceptanceTimeIn(List<Date> values) {
            addCriterion("customer_acceptance_time in", values, "customerAcceptanceTime");
            return (Criteria) this;
        }

        public Criteria andCustomerAcceptanceTimeNotIn(List<Date> values) {
            addCriterion("customer_acceptance_time not in", values, "customerAcceptanceTime");
            return (Criteria) this;
        }

        public Criteria andCustomerAcceptanceTimeBetween(Date value1, Date value2) {
            addCriterion("customer_acceptance_time between", value1, value2, "customerAcceptanceTime");
            return (Criteria) this;
        }

        public Criteria andCustomerAcceptanceTimeNotBetween(Date value1, Date value2) {
            addCriterion("customer_acceptance_time not between", value1, value2, "customerAcceptanceTime");
            return (Criteria) this;
        }

        public Criteria andCompletedTimeIsNull() {
            addCriterion("completed_time is null");
            return (Criteria) this;
        }

        public Criteria andCompletedTimeIsNotNull() {
            addCriterion("completed_time is not null");
            return (Criteria) this;
        }

        public Criteria andCompletedTimeEqualTo(Date value) {
            addCriterion("completed_time =", value, "completedTime");
            return (Criteria) this;
        }

        public Criteria andCompletedTimeNotEqualTo(Date value) {
            addCriterion("completed_time <>", value, "completedTime");
            return (Criteria) this;
        }

        public Criteria andCompletedTimeGreaterThan(Date value) {
            addCriterion("completed_time >", value, "completedTime");
            return (Criteria) this;
        }

        public Criteria andCompletedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("completed_time >=", value, "completedTime");
            return (Criteria) this;
        }

        public Criteria andCompletedTimeLessThan(Date value) {
            addCriterion("completed_time <", value, "completedTime");
            return (Criteria) this;
        }

        public Criteria andCompletedTimeLessThanOrEqualTo(Date value) {
            addCriterion("completed_time <=", value, "completedTime");
            return (Criteria) this;
        }

        public Criteria andCompletedTimeIn(List<Date> values) {
            addCriterion("completed_time in", values, "completedTime");
            return (Criteria) this;
        }

        public Criteria andCompletedTimeNotIn(List<Date> values) {
            addCriterion("completed_time not in", values, "completedTime");
            return (Criteria) this;
        }

        public Criteria andCompletedTimeBetween(Date value1, Date value2) {
            addCriterion("completed_time between", value1, value2, "completedTime");
            return (Criteria) this;
        }

        public Criteria andCompletedTimeNotBetween(Date value1, Date value2) {
            addCriterion("completed_time not between", value1, value2, "completedTime");
            return (Criteria) this;
        }

        public Criteria andSignLongitudeIsNull() {
            addCriterion("sign_longitude is null");
            return (Criteria) this;
        }

        public Criteria andSignLongitudeIsNotNull() {
            addCriterion("sign_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andSignLongitudeEqualTo(BigDecimal value) {
            addCriterion("sign_longitude =", value, "signLongitude");
            return (Criteria) this;
        }

        public Criteria andSignLongitudeNotEqualTo(BigDecimal value) {
            addCriterion("sign_longitude <>", value, "signLongitude");
            return (Criteria) this;
        }

        public Criteria andSignLongitudeGreaterThan(BigDecimal value) {
            addCriterion("sign_longitude >", value, "signLongitude");
            return (Criteria) this;
        }

        public Criteria andSignLongitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sign_longitude >=", value, "signLongitude");
            return (Criteria) this;
        }

        public Criteria andSignLongitudeLessThan(BigDecimal value) {
            addCriterion("sign_longitude <", value, "signLongitude");
            return (Criteria) this;
        }

        public Criteria andSignLongitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sign_longitude <=", value, "signLongitude");
            return (Criteria) this;
        }

        public Criteria andSignLongitudeIn(List<BigDecimal> values) {
            addCriterion("sign_longitude in", values, "signLongitude");
            return (Criteria) this;
        }

        public Criteria andSignLongitudeNotIn(List<BigDecimal> values) {
            addCriterion("sign_longitude not in", values, "signLongitude");
            return (Criteria) this;
        }

        public Criteria andSignLongitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sign_longitude between", value1, value2, "signLongitude");
            return (Criteria) this;
        }

        public Criteria andSignLongitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sign_longitude not between", value1, value2, "signLongitude");
            return (Criteria) this;
        }

        public Criteria andSignLatitudeIsNull() {
            addCriterion("sign_latitude is null");
            return (Criteria) this;
        }

        public Criteria andSignLatitudeIsNotNull() {
            addCriterion("sign_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andSignLatitudeEqualTo(BigDecimal value) {
            addCriterion("sign_latitude =", value, "signLatitude");
            return (Criteria) this;
        }

        public Criteria andSignLatitudeNotEqualTo(BigDecimal value) {
            addCriterion("sign_latitude <>", value, "signLatitude");
            return (Criteria) this;
        }

        public Criteria andSignLatitudeGreaterThan(BigDecimal value) {
            addCriterion("sign_latitude >", value, "signLatitude");
            return (Criteria) this;
        }

        public Criteria andSignLatitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sign_latitude >=", value, "signLatitude");
            return (Criteria) this;
        }

        public Criteria andSignLatitudeLessThan(BigDecimal value) {
            addCriterion("sign_latitude <", value, "signLatitude");
            return (Criteria) this;
        }

        public Criteria andSignLatitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sign_latitude <=", value, "signLatitude");
            return (Criteria) this;
        }

        public Criteria andSignLatitudeIn(List<BigDecimal> values) {
            addCriterion("sign_latitude in", values, "signLatitude");
            return (Criteria) this;
        }

        public Criteria andSignLatitudeNotIn(List<BigDecimal> values) {
            addCriterion("sign_latitude not in", values, "signLatitude");
            return (Criteria) this;
        }

        public Criteria andSignLatitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sign_latitude between", value1, value2, "signLatitude");
            return (Criteria) this;
        }

        public Criteria andSignLatitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sign_latitude not between", value1, value2, "signLatitude");
            return (Criteria) this;
        }

        public Criteria andIsGrabbedIsNull() {
            addCriterion("is_grabbed is null");
            return (Criteria) this;
        }

        public Criteria andIsGrabbedIsNotNull() {
            addCriterion("is_grabbed is not null");
            return (Criteria) this;
        }

        public Criteria andIsGrabbedEqualTo(String value) {
            addCriterion("is_grabbed =", value, "isGrabbed");
            return (Criteria) this;
        }

        public Criteria andIsGrabbedNotEqualTo(String value) {
            addCriterion("is_grabbed <>", value, "isGrabbed");
            return (Criteria) this;
        }

        public Criteria andIsGrabbedGreaterThan(String value) {
            addCriterion("is_grabbed >", value, "isGrabbed");
            return (Criteria) this;
        }

        public Criteria andIsGrabbedGreaterThanOrEqualTo(String value) {
            addCriterion("is_grabbed >=", value, "isGrabbed");
            return (Criteria) this;
        }

        public Criteria andIsGrabbedLessThan(String value) {
            addCriterion("is_grabbed <", value, "isGrabbed");
            return (Criteria) this;
        }

        public Criteria andIsGrabbedLessThanOrEqualTo(String value) {
            addCriterion("is_grabbed <=", value, "isGrabbed");
            return (Criteria) this;
        }

        public Criteria andIsGrabbedLike(String value) {
            addCriterion("is_grabbed like", value, "isGrabbed");
            return (Criteria) this;
        }

        public Criteria andIsGrabbedNotLike(String value) {
            addCriterion("is_grabbed not like", value, "isGrabbed");
            return (Criteria) this;
        }

        public Criteria andIsGrabbedIn(List<String> values) {
            addCriterion("is_grabbed in", values, "isGrabbed");
            return (Criteria) this;
        }

        public Criteria andIsGrabbedNotIn(List<String> values) {
            addCriterion("is_grabbed not in", values, "isGrabbed");
            return (Criteria) this;
        }

        public Criteria andIsGrabbedBetween(String value1, String value2) {
            addCriterion("is_grabbed between", value1, value2, "isGrabbed");
            return (Criteria) this;
        }

        public Criteria andIsGrabbedNotBetween(String value1, String value2) {
            addCriterion("is_grabbed not between", value1, value2, "isGrabbed");
            return (Criteria) this;
        }

        public Criteria andCustomerPrepayAmountIsNull() {
            addCriterion("customer_prepay_amount is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPrepayAmountIsNotNull() {
            addCriterion("customer_prepay_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPrepayAmountEqualTo(BigDecimal value) {
            addCriterion("customer_prepay_amount =", value, "customerPrepayAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerPrepayAmountNotEqualTo(BigDecimal value) {
            addCriterion("customer_prepay_amount <>", value, "customerPrepayAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerPrepayAmountGreaterThan(BigDecimal value) {
            addCriterion("customer_prepay_amount >", value, "customerPrepayAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerPrepayAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("customer_prepay_amount >=", value, "customerPrepayAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerPrepayAmountLessThan(BigDecimal value) {
            addCriterion("customer_prepay_amount <", value, "customerPrepayAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerPrepayAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("customer_prepay_amount <=", value, "customerPrepayAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerPrepayAmountIn(List<BigDecimal> values) {
            addCriterion("customer_prepay_amount in", values, "customerPrepayAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerPrepayAmountNotIn(List<BigDecimal> values) {
            addCriterion("customer_prepay_amount not in", values, "customerPrepayAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerPrepayAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("customer_prepay_amount between", value1, value2, "customerPrepayAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerPrepayAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("customer_prepay_amount not between", value1, value2, "customerPrepayAmount");
            return (Criteria) this;
        }

        public Criteria andGrabOrderTimestampIsNull() {
            addCriterion("grab_order_timestamp is null");
            return (Criteria) this;
        }

        public Criteria andGrabOrderTimestampIsNotNull() {
            addCriterion("grab_order_timestamp is not null");
            return (Criteria) this;
        }

        public Criteria andGrabOrderTimestampEqualTo(Long value) {
            addCriterion("grab_order_timestamp =", value, "grabOrderTimestamp");
            return (Criteria) this;
        }

        public Criteria andGrabOrderTimestampNotEqualTo(Long value) {
            addCriterion("grab_order_timestamp <>", value, "grabOrderTimestamp");
            return (Criteria) this;
        }

        public Criteria andGrabOrderTimestampGreaterThan(Long value) {
            addCriterion("grab_order_timestamp >", value, "grabOrderTimestamp");
            return (Criteria) this;
        }

        public Criteria andGrabOrderTimestampGreaterThanOrEqualTo(Long value) {
            addCriterion("grab_order_timestamp >=", value, "grabOrderTimestamp");
            return (Criteria) this;
        }

        public Criteria andGrabOrderTimestampLessThan(Long value) {
            addCriterion("grab_order_timestamp <", value, "grabOrderTimestamp");
            return (Criteria) this;
        }

        public Criteria andGrabOrderTimestampLessThanOrEqualTo(Long value) {
            addCriterion("grab_order_timestamp <=", value, "grabOrderTimestamp");
            return (Criteria) this;
        }

        public Criteria andGrabOrderTimestampIn(List<Long> values) {
            addCriterion("grab_order_timestamp in", values, "grabOrderTimestamp");
            return (Criteria) this;
        }

        public Criteria andGrabOrderTimestampNotIn(List<Long> values) {
            addCriterion("grab_order_timestamp not in", values, "grabOrderTimestamp");
            return (Criteria) this;
        }

        public Criteria andGrabOrderTimestampBetween(Long value1, Long value2) {
            addCriterion("grab_order_timestamp between", value1, value2, "grabOrderTimestamp");
            return (Criteria) this;
        }

        public Criteria andGrabOrderTimestampNotBetween(Long value1, Long value2) {
            addCriterion("grab_order_timestamp not between", value1, value2, "grabOrderTimestamp");
            return (Criteria) this;
        }

        public Criteria andArtisanIncomeAmountIsNull() {
            addCriterion("artisan_income_amount is null");
            return (Criteria) this;
        }

        public Criteria andArtisanIncomeAmountIsNotNull() {
            addCriterion("artisan_income_amount is not null");
            return (Criteria) this;
        }

        public Criteria andArtisanIncomeAmountEqualTo(BigDecimal value) {
            addCriterion("artisan_income_amount =", value, "artisanIncomeAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanIncomeAmountNotEqualTo(BigDecimal value) {
            addCriterion("artisan_income_amount <>", value, "artisanIncomeAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanIncomeAmountGreaterThan(BigDecimal value) {
            addCriterion("artisan_income_amount >", value, "artisanIncomeAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanIncomeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("artisan_income_amount >=", value, "artisanIncomeAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanIncomeAmountLessThan(BigDecimal value) {
            addCriterion("artisan_income_amount <", value, "artisanIncomeAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanIncomeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("artisan_income_amount <=", value, "artisanIncomeAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanIncomeAmountIn(List<BigDecimal> values) {
            addCriterion("artisan_income_amount in", values, "artisanIncomeAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanIncomeAmountNotIn(List<BigDecimal> values) {
            addCriterion("artisan_income_amount not in", values, "artisanIncomeAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanIncomeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("artisan_income_amount between", value1, value2, "artisanIncomeAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanIncomeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("artisan_income_amount not between", value1, value2, "artisanIncomeAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanRewardPunishmentTotalAmountIsNull() {
            addCriterion("artisan_reward_punishment_total_amount is null");
            return (Criteria) this;
        }

        public Criteria andArtisanRewardPunishmentTotalAmountIsNotNull() {
            addCriterion("artisan_reward_punishment_total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andArtisanRewardPunishmentTotalAmountEqualTo(BigDecimal value) {
            addCriterion("artisan_reward_punishment_total_amount =", value, "artisanRewardPunishmentTotalAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanRewardPunishmentTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("artisan_reward_punishment_total_amount <>", value, "artisanRewardPunishmentTotalAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanRewardPunishmentTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("artisan_reward_punishment_total_amount >", value, "artisanRewardPunishmentTotalAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanRewardPunishmentTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("artisan_reward_punishment_total_amount >=", value, "artisanRewardPunishmentTotalAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanRewardPunishmentTotalAmountLessThan(BigDecimal value) {
            addCriterion("artisan_reward_punishment_total_amount <", value, "artisanRewardPunishmentTotalAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanRewardPunishmentTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("artisan_reward_punishment_total_amount <=", value, "artisanRewardPunishmentTotalAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanRewardPunishmentTotalAmountIn(List<BigDecimal> values) {
            addCriterion("artisan_reward_punishment_total_amount in", values, "artisanRewardPunishmentTotalAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanRewardPunishmentTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("artisan_reward_punishment_total_amount not in", values, "artisanRewardPunishmentTotalAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanRewardPunishmentTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("artisan_reward_punishment_total_amount between", value1, value2, "artisanRewardPunishmentTotalAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanRewardPunishmentTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("artisan_reward_punishment_total_amount not between", value1, value2, "artisanRewardPunishmentTotalAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanTakingProductRewardAmountIsNull() {
            addCriterion("artisan_taking_product_reward_amount is null");
            return (Criteria) this;
        }

        public Criteria andArtisanTakingProductRewardAmountIsNotNull() {
            addCriterion("artisan_taking_product_reward_amount is not null");
            return (Criteria) this;
        }

        public Criteria andArtisanTakingProductRewardAmountEqualTo(BigDecimal value) {
            addCriterion("artisan_taking_product_reward_amount =", value, "artisanTakingProductRewardAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanTakingProductRewardAmountNotEqualTo(BigDecimal value) {
            addCriterion("artisan_taking_product_reward_amount <>", value, "artisanTakingProductRewardAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanTakingProductRewardAmountGreaterThan(BigDecimal value) {
            addCriterion("artisan_taking_product_reward_amount >", value, "artisanTakingProductRewardAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanTakingProductRewardAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("artisan_taking_product_reward_amount >=", value, "artisanTakingProductRewardAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanTakingProductRewardAmountLessThan(BigDecimal value) {
            addCriterion("artisan_taking_product_reward_amount <", value, "artisanTakingProductRewardAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanTakingProductRewardAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("artisan_taking_product_reward_amount <=", value, "artisanTakingProductRewardAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanTakingProductRewardAmountIn(List<BigDecimal> values) {
            addCriterion("artisan_taking_product_reward_amount in", values, "artisanTakingProductRewardAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanTakingProductRewardAmountNotIn(List<BigDecimal> values) {
            addCriterion("artisan_taking_product_reward_amount not in", values, "artisanTakingProductRewardAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanTakingProductRewardAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("artisan_taking_product_reward_amount between", value1, value2, "artisanTakingProductRewardAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanTakingProductRewardAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("artisan_taking_product_reward_amount not between", value1, value2, "artisanTakingProductRewardAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanAgentChargeRewardAmountIsNull() {
            addCriterion("artisan_agent_charge_reward_amount is null");
            return (Criteria) this;
        }

        public Criteria andArtisanAgentChargeRewardAmountIsNotNull() {
            addCriterion("artisan_agent_charge_reward_amount is not null");
            return (Criteria) this;
        }

        public Criteria andArtisanAgentChargeRewardAmountEqualTo(BigDecimal value) {
            addCriterion("artisan_agent_charge_reward_amount =", value, "artisanAgentChargeRewardAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanAgentChargeRewardAmountNotEqualTo(BigDecimal value) {
            addCriterion("artisan_agent_charge_reward_amount <>", value, "artisanAgentChargeRewardAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanAgentChargeRewardAmountGreaterThan(BigDecimal value) {
            addCriterion("artisan_agent_charge_reward_amount >", value, "artisanAgentChargeRewardAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanAgentChargeRewardAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("artisan_agent_charge_reward_amount >=", value, "artisanAgentChargeRewardAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanAgentChargeRewardAmountLessThan(BigDecimal value) {
            addCriterion("artisan_agent_charge_reward_amount <", value, "artisanAgentChargeRewardAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanAgentChargeRewardAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("artisan_agent_charge_reward_amount <=", value, "artisanAgentChargeRewardAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanAgentChargeRewardAmountIn(List<BigDecimal> values) {
            addCriterion("artisan_agent_charge_reward_amount in", values, "artisanAgentChargeRewardAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanAgentChargeRewardAmountNotIn(List<BigDecimal> values) {
            addCriterion("artisan_agent_charge_reward_amount not in", values, "artisanAgentChargeRewardAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanAgentChargeRewardAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("artisan_agent_charge_reward_amount between", value1, value2, "artisanAgentChargeRewardAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanAgentChargeRewardAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("artisan_agent_charge_reward_amount not between", value1, value2, "artisanAgentChargeRewardAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanServiceAmountIsNull() {
            addCriterion("artisan_service_amount is null");
            return (Criteria) this;
        }

        public Criteria andArtisanServiceAmountIsNotNull() {
            addCriterion("artisan_service_amount is not null");
            return (Criteria) this;
        }

        public Criteria andArtisanServiceAmountEqualTo(BigDecimal value) {
            addCriterion("artisan_service_amount =", value, "artisanServiceAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanServiceAmountNotEqualTo(BigDecimal value) {
            addCriterion("artisan_service_amount <>", value, "artisanServiceAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanServiceAmountGreaterThan(BigDecimal value) {
            addCriterion("artisan_service_amount >", value, "artisanServiceAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanServiceAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("artisan_service_amount >=", value, "artisanServiceAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanServiceAmountLessThan(BigDecimal value) {
            addCriterion("artisan_service_amount <", value, "artisanServiceAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanServiceAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("artisan_service_amount <=", value, "artisanServiceAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanServiceAmountIn(List<BigDecimal> values) {
            addCriterion("artisan_service_amount in", values, "artisanServiceAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanServiceAmountNotIn(List<BigDecimal> values) {
            addCriterion("artisan_service_amount not in", values, "artisanServiceAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanServiceAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("artisan_service_amount between", value1, value2, "artisanServiceAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanServiceAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("artisan_service_amount not between", value1, value2, "artisanServiceAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanDistancePaymentAmountIsNull() {
            addCriterion("artisan_distance_payment_amount is null");
            return (Criteria) this;
        }

        public Criteria andArtisanDistancePaymentAmountIsNotNull() {
            addCriterion("artisan_distance_payment_amount is not null");
            return (Criteria) this;
        }

        public Criteria andArtisanDistancePaymentAmountEqualTo(BigDecimal value) {
            addCriterion("artisan_distance_payment_amount =", value, "artisanDistancePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanDistancePaymentAmountNotEqualTo(BigDecimal value) {
            addCriterion("artisan_distance_payment_amount <>", value, "artisanDistancePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanDistancePaymentAmountGreaterThan(BigDecimal value) {
            addCriterion("artisan_distance_payment_amount >", value, "artisanDistancePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanDistancePaymentAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("artisan_distance_payment_amount >=", value, "artisanDistancePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanDistancePaymentAmountLessThan(BigDecimal value) {
            addCriterion("artisan_distance_payment_amount <", value, "artisanDistancePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanDistancePaymentAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("artisan_distance_payment_amount <=", value, "artisanDistancePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanDistancePaymentAmountIn(List<BigDecimal> values) {
            addCriterion("artisan_distance_payment_amount in", values, "artisanDistancePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanDistancePaymentAmountNotIn(List<BigDecimal> values) {
            addCriterion("artisan_distance_payment_amount not in", values, "artisanDistancePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanDistancePaymentAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("artisan_distance_payment_amount between", value1, value2, "artisanDistancePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanDistancePaymentAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("artisan_distance_payment_amount not between", value1, value2, "artisanDistancePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanAmendmentAmountIsNull() {
            addCriterion("artisan_amendment_amount is null");
            return (Criteria) this;
        }

        public Criteria andArtisanAmendmentAmountIsNotNull() {
            addCriterion("artisan_amendment_amount is not null");
            return (Criteria) this;
        }

        public Criteria andArtisanAmendmentAmountEqualTo(BigDecimal value) {
            addCriterion("artisan_amendment_amount =", value, "artisanAmendmentAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanAmendmentAmountNotEqualTo(BigDecimal value) {
            addCriterion("artisan_amendment_amount <>", value, "artisanAmendmentAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanAmendmentAmountGreaterThan(BigDecimal value) {
            addCriterion("artisan_amendment_amount >", value, "artisanAmendmentAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanAmendmentAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("artisan_amendment_amount >=", value, "artisanAmendmentAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanAmendmentAmountLessThan(BigDecimal value) {
            addCriterion("artisan_amendment_amount <", value, "artisanAmendmentAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanAmendmentAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("artisan_amendment_amount <=", value, "artisanAmendmentAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanAmendmentAmountIn(List<BigDecimal> values) {
            addCriterion("artisan_amendment_amount in", values, "artisanAmendmentAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanAmendmentAmountNotIn(List<BigDecimal> values) {
            addCriterion("artisan_amendment_amount not in", values, "artisanAmendmentAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanAmendmentAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("artisan_amendment_amount between", value1, value2, "artisanAmendmentAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanAmendmentAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("artisan_amendment_amount not between", value1, value2, "artisanAmendmentAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanAdditionAmountIsNull() {
            addCriterion("artisan_addition_amount is null");
            return (Criteria) this;
        }

        public Criteria andArtisanAdditionAmountIsNotNull() {
            addCriterion("artisan_addition_amount is not null");
            return (Criteria) this;
        }

        public Criteria andArtisanAdditionAmountEqualTo(BigDecimal value) {
            addCriterion("artisan_addition_amount =", value, "artisanAdditionAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanAdditionAmountNotEqualTo(BigDecimal value) {
            addCriterion("artisan_addition_amount <>", value, "artisanAdditionAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanAdditionAmountGreaterThan(BigDecimal value) {
            addCriterion("artisan_addition_amount >", value, "artisanAdditionAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanAdditionAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("artisan_addition_amount >=", value, "artisanAdditionAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanAdditionAmountLessThan(BigDecimal value) {
            addCriterion("artisan_addition_amount <", value, "artisanAdditionAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanAdditionAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("artisan_addition_amount <=", value, "artisanAdditionAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanAdditionAmountIn(List<BigDecimal> values) {
            addCriterion("artisan_addition_amount in", values, "artisanAdditionAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanAdditionAmountNotIn(List<BigDecimal> values) {
            addCriterion("artisan_addition_amount not in", values, "artisanAdditionAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanAdditionAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("artisan_addition_amount between", value1, value2, "artisanAdditionAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanAdditionAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("artisan_addition_amount not between", value1, value2, "artisanAdditionAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanAdditionAmountNoteIsNull() {
            addCriterion("artisan_addition_amount_note is null");
            return (Criteria) this;
        }

        public Criteria andArtisanAdditionAmountNoteIsNotNull() {
            addCriterion("artisan_addition_amount_note is not null");
            return (Criteria) this;
        }

        public Criteria andArtisanAdditionAmountNoteEqualTo(String value) {
            addCriterion("artisan_addition_amount_note =", value, "artisanAdditionAmountNote");
            return (Criteria) this;
        }

        public Criteria andArtisanAdditionAmountNoteNotEqualTo(String value) {
            addCriterion("artisan_addition_amount_note <>", value, "artisanAdditionAmountNote");
            return (Criteria) this;
        }

        public Criteria andArtisanAdditionAmountNoteGreaterThan(String value) {
            addCriterion("artisan_addition_amount_note >", value, "artisanAdditionAmountNote");
            return (Criteria) this;
        }

        public Criteria andArtisanAdditionAmountNoteGreaterThanOrEqualTo(String value) {
            addCriterion("artisan_addition_amount_note >=", value, "artisanAdditionAmountNote");
            return (Criteria) this;
        }

        public Criteria andArtisanAdditionAmountNoteLessThan(String value) {
            addCriterion("artisan_addition_amount_note <", value, "artisanAdditionAmountNote");
            return (Criteria) this;
        }

        public Criteria andArtisanAdditionAmountNoteLessThanOrEqualTo(String value) {
            addCriterion("artisan_addition_amount_note <=", value, "artisanAdditionAmountNote");
            return (Criteria) this;
        }

        public Criteria andArtisanAdditionAmountNoteLike(String value) {
            addCriterion("artisan_addition_amount_note like", value, "artisanAdditionAmountNote");
            return (Criteria) this;
        }

        public Criteria andArtisanAdditionAmountNoteNotLike(String value) {
            addCriterion("artisan_addition_amount_note not like", value, "artisanAdditionAmountNote");
            return (Criteria) this;
        }

        public Criteria andArtisanAdditionAmountNoteIn(List<String> values) {
            addCriterion("artisan_addition_amount_note in", values, "artisanAdditionAmountNote");
            return (Criteria) this;
        }

        public Criteria andArtisanAdditionAmountNoteNotIn(List<String> values) {
            addCriterion("artisan_addition_amount_note not in", values, "artisanAdditionAmountNote");
            return (Criteria) this;
        }

        public Criteria andArtisanAdditionAmountNoteBetween(String value1, String value2) {
            addCriterion("artisan_addition_amount_note between", value1, value2, "artisanAdditionAmountNote");
            return (Criteria) this;
        }

        public Criteria andArtisanAdditionAmountNoteNotBetween(String value1, String value2) {
            addCriterion("artisan_addition_amount_note not between", value1, value2, "artisanAdditionAmountNote");
            return (Criteria) this;
        }

        public Criteria andArtisanExtraChargeAdditionAmountIsNull() {
            addCriterion("artisan_extra_charge_addition_amount is null");
            return (Criteria) this;
        }

        public Criteria andArtisanExtraChargeAdditionAmountIsNotNull() {
            addCriterion("artisan_extra_charge_addition_amount is not null");
            return (Criteria) this;
        }

        public Criteria andArtisanExtraChargeAdditionAmountEqualTo(BigDecimal value) {
            addCriterion("artisan_extra_charge_addition_amount =", value, "artisanExtraChargeAdditionAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanExtraChargeAdditionAmountNotEqualTo(BigDecimal value) {
            addCriterion("artisan_extra_charge_addition_amount <>", value, "artisanExtraChargeAdditionAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanExtraChargeAdditionAmountGreaterThan(BigDecimal value) {
            addCriterion("artisan_extra_charge_addition_amount >", value, "artisanExtraChargeAdditionAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanExtraChargeAdditionAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("artisan_extra_charge_addition_amount >=", value, "artisanExtraChargeAdditionAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanExtraChargeAdditionAmountLessThan(BigDecimal value) {
            addCriterion("artisan_extra_charge_addition_amount <", value, "artisanExtraChargeAdditionAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanExtraChargeAdditionAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("artisan_extra_charge_addition_amount <=", value, "artisanExtraChargeAdditionAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanExtraChargeAdditionAmountIn(List<BigDecimal> values) {
            addCriterion("artisan_extra_charge_addition_amount in", values, "artisanExtraChargeAdditionAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanExtraChargeAdditionAmountNotIn(List<BigDecimal> values) {
            addCriterion("artisan_extra_charge_addition_amount not in", values, "artisanExtraChargeAdditionAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanExtraChargeAdditionAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("artisan_extra_charge_addition_amount between", value1, value2, "artisanExtraChargeAdditionAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanExtraChargeAdditionAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("artisan_extra_charge_addition_amount not between", value1, value2, "artisanExtraChargeAdditionAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanServiceTotalScoreIsNull() {
            addCriterion("artisan_service_total_score is null");
            return (Criteria) this;
        }

        public Criteria andArtisanServiceTotalScoreIsNotNull() {
            addCriterion("artisan_service_total_score is not null");
            return (Criteria) this;
        }

        public Criteria andArtisanServiceTotalScoreEqualTo(Integer value) {
            addCriterion("artisan_service_total_score =", value, "artisanServiceTotalScore");
            return (Criteria) this;
        }

        public Criteria andArtisanServiceTotalScoreNotEqualTo(Integer value) {
            addCriterion("artisan_service_total_score <>", value, "artisanServiceTotalScore");
            return (Criteria) this;
        }

        public Criteria andArtisanServiceTotalScoreGreaterThan(Integer value) {
            addCriterion("artisan_service_total_score >", value, "artisanServiceTotalScore");
            return (Criteria) this;
        }

        public Criteria andArtisanServiceTotalScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("artisan_service_total_score >=", value, "artisanServiceTotalScore");
            return (Criteria) this;
        }

        public Criteria andArtisanServiceTotalScoreLessThan(Integer value) {
            addCriterion("artisan_service_total_score <", value, "artisanServiceTotalScore");
            return (Criteria) this;
        }

        public Criteria andArtisanServiceTotalScoreLessThanOrEqualTo(Integer value) {
            addCriterion("artisan_service_total_score <=", value, "artisanServiceTotalScore");
            return (Criteria) this;
        }

        public Criteria andArtisanServiceTotalScoreIn(List<Integer> values) {
            addCriterion("artisan_service_total_score in", values, "artisanServiceTotalScore");
            return (Criteria) this;
        }

        public Criteria andArtisanServiceTotalScoreNotIn(List<Integer> values) {
            addCriterion("artisan_service_total_score not in", values, "artisanServiceTotalScore");
            return (Criteria) this;
        }

        public Criteria andArtisanServiceTotalScoreBetween(Integer value1, Integer value2) {
            addCriterion("artisan_service_total_score between", value1, value2, "artisanServiceTotalScore");
            return (Criteria) this;
        }

        public Criteria andArtisanServiceTotalScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("artisan_service_total_score not between", value1, value2, "artisanServiceTotalScore");
            return (Criteria) this;
        }

        public Criteria andMerchantTotalPaymentAmountIsNull() {
            addCriterion("merchant_total_payment_amount is null");
            return (Criteria) this;
        }

        public Criteria andMerchantTotalPaymentAmountIsNotNull() {
            addCriterion("merchant_total_payment_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantTotalPaymentAmountEqualTo(BigDecimal value) {
            addCriterion("merchant_total_payment_amount =", value, "merchantTotalPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantTotalPaymentAmountNotEqualTo(BigDecimal value) {
            addCriterion("merchant_total_payment_amount <>", value, "merchantTotalPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantTotalPaymentAmountGreaterThan(BigDecimal value) {
            addCriterion("merchant_total_payment_amount >", value, "merchantTotalPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantTotalPaymentAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("merchant_total_payment_amount >=", value, "merchantTotalPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantTotalPaymentAmountLessThan(BigDecimal value) {
            addCriterion("merchant_total_payment_amount <", value, "merchantTotalPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantTotalPaymentAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("merchant_total_payment_amount <=", value, "merchantTotalPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantTotalPaymentAmountIn(List<BigDecimal> values) {
            addCriterion("merchant_total_payment_amount in", values, "merchantTotalPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantTotalPaymentAmountNotIn(List<BigDecimal> values) {
            addCriterion("merchant_total_payment_amount not in", values, "merchantTotalPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantTotalPaymentAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("merchant_total_payment_amount between", value1, value2, "merchantTotalPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantTotalPaymentAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("merchant_total_payment_amount not between", value1, value2, "merchantTotalPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantAgentChargePaymentAmountIsNull() {
            addCriterion("merchant_agent_charge_payment_amount is null");
            return (Criteria) this;
        }

        public Criteria andMerchantAgentChargePaymentAmountIsNotNull() {
            addCriterion("merchant_agent_charge_payment_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantAgentChargePaymentAmountEqualTo(BigDecimal value) {
            addCriterion("merchant_agent_charge_payment_amount =", value, "merchantAgentChargePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantAgentChargePaymentAmountNotEqualTo(BigDecimal value) {
            addCriterion("merchant_agent_charge_payment_amount <>", value, "merchantAgentChargePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantAgentChargePaymentAmountGreaterThan(BigDecimal value) {
            addCriterion("merchant_agent_charge_payment_amount >", value, "merchantAgentChargePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantAgentChargePaymentAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("merchant_agent_charge_payment_amount >=", value, "merchantAgentChargePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantAgentChargePaymentAmountLessThan(BigDecimal value) {
            addCriterion("merchant_agent_charge_payment_amount <", value, "merchantAgentChargePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantAgentChargePaymentAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("merchant_agent_charge_payment_amount <=", value, "merchantAgentChargePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantAgentChargePaymentAmountIn(List<BigDecimal> values) {
            addCriterion("merchant_agent_charge_payment_amount in", values, "merchantAgentChargePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantAgentChargePaymentAmountNotIn(List<BigDecimal> values) {
            addCriterion("merchant_agent_charge_payment_amount not in", values, "merchantAgentChargePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantAgentChargePaymentAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("merchant_agent_charge_payment_amount between", value1, value2, "merchantAgentChargePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantAgentChargePaymentAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("merchant_agent_charge_payment_amount not between", value1, value2, "merchantAgentChargePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantServiceDiscountAmountIsNull() {
            addCriterion("merchant_service_discount_amount is null");
            return (Criteria) this;
        }

        public Criteria andMerchantServiceDiscountAmountIsNotNull() {
            addCriterion("merchant_service_discount_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantServiceDiscountAmountEqualTo(BigDecimal value) {
            addCriterion("merchant_service_discount_amount =", value, "merchantServiceDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantServiceDiscountAmountNotEqualTo(BigDecimal value) {
            addCriterion("merchant_service_discount_amount <>", value, "merchantServiceDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantServiceDiscountAmountGreaterThan(BigDecimal value) {
            addCriterion("merchant_service_discount_amount >", value, "merchantServiceDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantServiceDiscountAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("merchant_service_discount_amount >=", value, "merchantServiceDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantServiceDiscountAmountLessThan(BigDecimal value) {
            addCriterion("merchant_service_discount_amount <", value, "merchantServiceDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantServiceDiscountAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("merchant_service_discount_amount <=", value, "merchantServiceDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantServiceDiscountAmountIn(List<BigDecimal> values) {
            addCriterion("merchant_service_discount_amount in", values, "merchantServiceDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantServiceDiscountAmountNotIn(List<BigDecimal> values) {
            addCriterion("merchant_service_discount_amount not in", values, "merchantServiceDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantServiceDiscountAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("merchant_service_discount_amount between", value1, value2, "merchantServiceDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantServiceDiscountAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("merchant_service_discount_amount not between", value1, value2, "merchantServiceDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantServicePaymentAmountIsNull() {
            addCriterion("merchant_service_payment_amount is null");
            return (Criteria) this;
        }

        public Criteria andMerchantServicePaymentAmountIsNotNull() {
            addCriterion("merchant_service_payment_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantServicePaymentAmountEqualTo(BigDecimal value) {
            addCriterion("merchant_service_payment_amount =", value, "merchantServicePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantServicePaymentAmountNotEqualTo(BigDecimal value) {
            addCriterion("merchant_service_payment_amount <>", value, "merchantServicePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantServicePaymentAmountGreaterThan(BigDecimal value) {
            addCriterion("merchant_service_payment_amount >", value, "merchantServicePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantServicePaymentAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("merchant_service_payment_amount >=", value, "merchantServicePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantServicePaymentAmountLessThan(BigDecimal value) {
            addCriterion("merchant_service_payment_amount <", value, "merchantServicePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantServicePaymentAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("merchant_service_payment_amount <=", value, "merchantServicePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantServicePaymentAmountIn(List<BigDecimal> values) {
            addCriterion("merchant_service_payment_amount in", values, "merchantServicePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantServicePaymentAmountNotIn(List<BigDecimal> values) {
            addCriterion("merchant_service_payment_amount not in", values, "merchantServicePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantServicePaymentAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("merchant_service_payment_amount between", value1, value2, "merchantServicePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantServicePaymentAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("merchant_service_payment_amount not between", value1, value2, "merchantServicePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantDistancePaymentAmountIsNull() {
            addCriterion("merchant_distance_payment_amount is null");
            return (Criteria) this;
        }

        public Criteria andMerchantDistancePaymentAmountIsNotNull() {
            addCriterion("merchant_distance_payment_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantDistancePaymentAmountEqualTo(BigDecimal value) {
            addCriterion("merchant_distance_payment_amount =", value, "merchantDistancePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantDistancePaymentAmountNotEqualTo(BigDecimal value) {
            addCriterion("merchant_distance_payment_amount <>", value, "merchantDistancePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantDistancePaymentAmountGreaterThan(BigDecimal value) {
            addCriterion("merchant_distance_payment_amount >", value, "merchantDistancePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantDistancePaymentAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("merchant_distance_payment_amount >=", value, "merchantDistancePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantDistancePaymentAmountLessThan(BigDecimal value) {
            addCriterion("merchant_distance_payment_amount <", value, "merchantDistancePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantDistancePaymentAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("merchant_distance_payment_amount <=", value, "merchantDistancePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantDistancePaymentAmountIn(List<BigDecimal> values) {
            addCriterion("merchant_distance_payment_amount in", values, "merchantDistancePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantDistancePaymentAmountNotIn(List<BigDecimal> values) {
            addCriterion("merchant_distance_payment_amount not in", values, "merchantDistancePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantDistancePaymentAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("merchant_distance_payment_amount between", value1, value2, "merchantDistancePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantDistancePaymentAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("merchant_distance_payment_amount not between", value1, value2, "merchantDistancePaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentAmountIsNull() {
            addCriterion("merchant_addition_payment_amount is null");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentAmountIsNotNull() {
            addCriterion("merchant_addition_payment_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentAmountEqualTo(BigDecimal value) {
            addCriterion("merchant_addition_payment_amount =", value, "merchantAdditionPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentAmountNotEqualTo(BigDecimal value) {
            addCriterion("merchant_addition_payment_amount <>", value, "merchantAdditionPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentAmountGreaterThan(BigDecimal value) {
            addCriterion("merchant_addition_payment_amount >", value, "merchantAdditionPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("merchant_addition_payment_amount >=", value, "merchantAdditionPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentAmountLessThan(BigDecimal value) {
            addCriterion("merchant_addition_payment_amount <", value, "merchantAdditionPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("merchant_addition_payment_amount <=", value, "merchantAdditionPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentAmountIn(List<BigDecimal> values) {
            addCriterion("merchant_addition_payment_amount in", values, "merchantAdditionPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentAmountNotIn(List<BigDecimal> values) {
            addCriterion("merchant_addition_payment_amount not in", values, "merchantAdditionPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("merchant_addition_payment_amount between", value1, value2, "merchantAdditionPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("merchant_addition_payment_amount not between", value1, value2, "merchantAdditionPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentAmountNoteIsNull() {
            addCriterion("merchant_addition_payment_amount_note is null");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentAmountNoteIsNotNull() {
            addCriterion("merchant_addition_payment_amount_note is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentAmountNoteEqualTo(String value) {
            addCriterion("merchant_addition_payment_amount_note =", value, "merchantAdditionPaymentAmountNote");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentAmountNoteNotEqualTo(String value) {
            addCriterion("merchant_addition_payment_amount_note <>", value, "merchantAdditionPaymentAmountNote");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentAmountNoteGreaterThan(String value) {
            addCriterion("merchant_addition_payment_amount_note >", value, "merchantAdditionPaymentAmountNote");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentAmountNoteGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_addition_payment_amount_note >=", value, "merchantAdditionPaymentAmountNote");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentAmountNoteLessThan(String value) {
            addCriterion("merchant_addition_payment_amount_note <", value, "merchantAdditionPaymentAmountNote");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentAmountNoteLessThanOrEqualTo(String value) {
            addCriterion("merchant_addition_payment_amount_note <=", value, "merchantAdditionPaymentAmountNote");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentAmountNoteLike(String value) {
            addCriterion("merchant_addition_payment_amount_note like", value, "merchantAdditionPaymentAmountNote");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentAmountNoteNotLike(String value) {
            addCriterion("merchant_addition_payment_amount_note not like", value, "merchantAdditionPaymentAmountNote");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentAmountNoteIn(List<String> values) {
            addCriterion("merchant_addition_payment_amount_note in", values, "merchantAdditionPaymentAmountNote");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentAmountNoteNotIn(List<String> values) {
            addCriterion("merchant_addition_payment_amount_note not in", values, "merchantAdditionPaymentAmountNote");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentAmountNoteBetween(String value1, String value2) {
            addCriterion("merchant_addition_payment_amount_note between", value1, value2, "merchantAdditionPaymentAmountNote");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentAmountNoteNotBetween(String value1, String value2) {
            addCriterion("merchant_addition_payment_amount_note not between", value1, value2, "merchantAdditionPaymentAmountNote");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentUrl1IsNull() {
            addCriterion("merchant_addition_payment_url1 is null");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentUrl1IsNotNull() {
            addCriterion("merchant_addition_payment_url1 is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentUrl1EqualTo(String value) {
            addCriterion("merchant_addition_payment_url1 =", value, "merchantAdditionPaymentUrl1");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentUrl1NotEqualTo(String value) {
            addCriterion("merchant_addition_payment_url1 <>", value, "merchantAdditionPaymentUrl1");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentUrl1GreaterThan(String value) {
            addCriterion("merchant_addition_payment_url1 >", value, "merchantAdditionPaymentUrl1");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentUrl1GreaterThanOrEqualTo(String value) {
            addCriterion("merchant_addition_payment_url1 >=", value, "merchantAdditionPaymentUrl1");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentUrl1LessThan(String value) {
            addCriterion("merchant_addition_payment_url1 <", value, "merchantAdditionPaymentUrl1");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentUrl1LessThanOrEqualTo(String value) {
            addCriterion("merchant_addition_payment_url1 <=", value, "merchantAdditionPaymentUrl1");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentUrl1Like(String value) {
            addCriterion("merchant_addition_payment_url1 like", value, "merchantAdditionPaymentUrl1");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentUrl1NotLike(String value) {
            addCriterion("merchant_addition_payment_url1 not like", value, "merchantAdditionPaymentUrl1");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentUrl1In(List<String> values) {
            addCriterion("merchant_addition_payment_url1 in", values, "merchantAdditionPaymentUrl1");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentUrl1NotIn(List<String> values) {
            addCriterion("merchant_addition_payment_url1 not in", values, "merchantAdditionPaymentUrl1");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentUrl1Between(String value1, String value2) {
            addCriterion("merchant_addition_payment_url1 between", value1, value2, "merchantAdditionPaymentUrl1");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentUrl1NotBetween(String value1, String value2) {
            addCriterion("merchant_addition_payment_url1 not between", value1, value2, "merchantAdditionPaymentUrl1");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentUrl2IsNull() {
            addCriterion("merchant_addition_payment_url2 is null");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentUrl2IsNotNull() {
            addCriterion("merchant_addition_payment_url2 is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentUrl2EqualTo(String value) {
            addCriterion("merchant_addition_payment_url2 =", value, "merchantAdditionPaymentUrl2");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentUrl2NotEqualTo(String value) {
            addCriterion("merchant_addition_payment_url2 <>", value, "merchantAdditionPaymentUrl2");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentUrl2GreaterThan(String value) {
            addCriterion("merchant_addition_payment_url2 >", value, "merchantAdditionPaymentUrl2");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentUrl2GreaterThanOrEqualTo(String value) {
            addCriterion("merchant_addition_payment_url2 >=", value, "merchantAdditionPaymentUrl2");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentUrl2LessThan(String value) {
            addCriterion("merchant_addition_payment_url2 <", value, "merchantAdditionPaymentUrl2");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentUrl2LessThanOrEqualTo(String value) {
            addCriterion("merchant_addition_payment_url2 <=", value, "merchantAdditionPaymentUrl2");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentUrl2Like(String value) {
            addCriterion("merchant_addition_payment_url2 like", value, "merchantAdditionPaymentUrl2");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentUrl2NotLike(String value) {
            addCriterion("merchant_addition_payment_url2 not like", value, "merchantAdditionPaymentUrl2");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentUrl2In(List<String> values) {
            addCriterion("merchant_addition_payment_url2 in", values, "merchantAdditionPaymentUrl2");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentUrl2NotIn(List<String> values) {
            addCriterion("merchant_addition_payment_url2 not in", values, "merchantAdditionPaymentUrl2");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentUrl2Between(String value1, String value2) {
            addCriterion("merchant_addition_payment_url2 between", value1, value2, "merchantAdditionPaymentUrl2");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentUrl2NotBetween(String value1, String value2) {
            addCriterion("merchant_addition_payment_url2 not between", value1, value2, "merchantAdditionPaymentUrl2");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentUrl3IsNull() {
            addCriterion("merchant_addition_payment_url3 is null");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentUrl3IsNotNull() {
            addCriterion("merchant_addition_payment_url3 is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentUrl3EqualTo(String value) {
            addCriterion("merchant_addition_payment_url3 =", value, "merchantAdditionPaymentUrl3");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentUrl3NotEqualTo(String value) {
            addCriterion("merchant_addition_payment_url3 <>", value, "merchantAdditionPaymentUrl3");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentUrl3GreaterThan(String value) {
            addCriterion("merchant_addition_payment_url3 >", value, "merchantAdditionPaymentUrl3");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentUrl3GreaterThanOrEqualTo(String value) {
            addCriterion("merchant_addition_payment_url3 >=", value, "merchantAdditionPaymentUrl3");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentUrl3LessThan(String value) {
            addCriterion("merchant_addition_payment_url3 <", value, "merchantAdditionPaymentUrl3");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentUrl3LessThanOrEqualTo(String value) {
            addCriterion("merchant_addition_payment_url3 <=", value, "merchantAdditionPaymentUrl3");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentUrl3Like(String value) {
            addCriterion("merchant_addition_payment_url3 like", value, "merchantAdditionPaymentUrl3");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentUrl3NotLike(String value) {
            addCriterion("merchant_addition_payment_url3 not like", value, "merchantAdditionPaymentUrl3");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentUrl3In(List<String> values) {
            addCriterion("merchant_addition_payment_url3 in", values, "merchantAdditionPaymentUrl3");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentUrl3NotIn(List<String> values) {
            addCriterion("merchant_addition_payment_url3 not in", values, "merchantAdditionPaymentUrl3");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentUrl3Between(String value1, String value2) {
            addCriterion("merchant_addition_payment_url3 between", value1, value2, "merchantAdditionPaymentUrl3");
            return (Criteria) this;
        }

        public Criteria andMerchantAdditionPaymentUrl3NotBetween(String value1, String value2) {
            addCriterion("merchant_addition_payment_url3 not between", value1, value2, "merchantAdditionPaymentUrl3");
            return (Criteria) this;
        }

        public Criteria andMerchantAgreementUrlIsNull() {
            addCriterion("merchant_agreement_url is null");
            return (Criteria) this;
        }

        public Criteria andMerchantAgreementUrlIsNotNull() {
            addCriterion("merchant_agreement_url is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantAgreementUrlEqualTo(String value) {
            addCriterion("merchant_agreement_url =", value, "merchantAgreementUrl");
            return (Criteria) this;
        }

        public Criteria andMerchantAgreementUrlNotEqualTo(String value) {
            addCriterion("merchant_agreement_url <>", value, "merchantAgreementUrl");
            return (Criteria) this;
        }

        public Criteria andMerchantAgreementUrlGreaterThan(String value) {
            addCriterion("merchant_agreement_url >", value, "merchantAgreementUrl");
            return (Criteria) this;
        }

        public Criteria andMerchantAgreementUrlGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_agreement_url >=", value, "merchantAgreementUrl");
            return (Criteria) this;
        }

        public Criteria andMerchantAgreementUrlLessThan(String value) {
            addCriterion("merchant_agreement_url <", value, "merchantAgreementUrl");
            return (Criteria) this;
        }

        public Criteria andMerchantAgreementUrlLessThanOrEqualTo(String value) {
            addCriterion("merchant_agreement_url <=", value, "merchantAgreementUrl");
            return (Criteria) this;
        }

        public Criteria andMerchantAgreementUrlLike(String value) {
            addCriterion("merchant_agreement_url like", value, "merchantAgreementUrl");
            return (Criteria) this;
        }

        public Criteria andMerchantAgreementUrlNotLike(String value) {
            addCriterion("merchant_agreement_url not like", value, "merchantAgreementUrl");
            return (Criteria) this;
        }

        public Criteria andMerchantAgreementUrlIn(List<String> values) {
            addCriterion("merchant_agreement_url in", values, "merchantAgreementUrl");
            return (Criteria) this;
        }

        public Criteria andMerchantAgreementUrlNotIn(List<String> values) {
            addCriterion("merchant_agreement_url not in", values, "merchantAgreementUrl");
            return (Criteria) this;
        }

        public Criteria andMerchantAgreementUrlBetween(String value1, String value2) {
            addCriterion("merchant_agreement_url between", value1, value2, "merchantAgreementUrl");
            return (Criteria) this;
        }

        public Criteria andMerchantAgreementUrlNotBetween(String value1, String value2) {
            addCriterion("merchant_agreement_url not between", value1, value2, "merchantAgreementUrl");
            return (Criteria) this;
        }

        public Criteria andOrderEstimateMaxAmountIsNull() {
            addCriterion("order_estimate_max_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrderEstimateMaxAmountIsNotNull() {
            addCriterion("order_estimate_max_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderEstimateMaxAmountEqualTo(BigDecimal value) {
            addCriterion("order_estimate_max_amount =", value, "orderEstimateMaxAmount");
            return (Criteria) this;
        }

        public Criteria andOrderEstimateMaxAmountNotEqualTo(BigDecimal value) {
            addCriterion("order_estimate_max_amount <>", value, "orderEstimateMaxAmount");
            return (Criteria) this;
        }

        public Criteria andOrderEstimateMaxAmountGreaterThan(BigDecimal value) {
            addCriterion("order_estimate_max_amount >", value, "orderEstimateMaxAmount");
            return (Criteria) this;
        }

        public Criteria andOrderEstimateMaxAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_estimate_max_amount >=", value, "orderEstimateMaxAmount");
            return (Criteria) this;
        }

        public Criteria andOrderEstimateMaxAmountLessThan(BigDecimal value) {
            addCriterion("order_estimate_max_amount <", value, "orderEstimateMaxAmount");
            return (Criteria) this;
        }

        public Criteria andOrderEstimateMaxAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_estimate_max_amount <=", value, "orderEstimateMaxAmount");
            return (Criteria) this;
        }

        public Criteria andOrderEstimateMaxAmountIn(List<BigDecimal> values) {
            addCriterion("order_estimate_max_amount in", values, "orderEstimateMaxAmount");
            return (Criteria) this;
        }

        public Criteria andOrderEstimateMaxAmountNotIn(List<BigDecimal> values) {
            addCriterion("order_estimate_max_amount not in", values, "orderEstimateMaxAmount");
            return (Criteria) this;
        }

        public Criteria andOrderEstimateMaxAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_estimate_max_amount between", value1, value2, "orderEstimateMaxAmount");
            return (Criteria) this;
        }

        public Criteria andOrderEstimateMaxAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_estimate_max_amount not between", value1, value2, "orderEstimateMaxAmount");
            return (Criteria) this;
        }

        public Criteria andOrderIncomeAmountIsNull() {
            addCriterion("order_income_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrderIncomeAmountIsNotNull() {
            addCriterion("order_income_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIncomeAmountEqualTo(BigDecimal value) {
            addCriterion("order_income_amount =", value, "orderIncomeAmount");
            return (Criteria) this;
        }

        public Criteria andOrderIncomeAmountNotEqualTo(BigDecimal value) {
            addCriterion("order_income_amount <>", value, "orderIncomeAmount");
            return (Criteria) this;
        }

        public Criteria andOrderIncomeAmountGreaterThan(BigDecimal value) {
            addCriterion("order_income_amount >", value, "orderIncomeAmount");
            return (Criteria) this;
        }

        public Criteria andOrderIncomeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_income_amount >=", value, "orderIncomeAmount");
            return (Criteria) this;
        }

        public Criteria andOrderIncomeAmountLessThan(BigDecimal value) {
            addCriterion("order_income_amount <", value, "orderIncomeAmount");
            return (Criteria) this;
        }

        public Criteria andOrderIncomeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_income_amount <=", value, "orderIncomeAmount");
            return (Criteria) this;
        }

        public Criteria andOrderIncomeAmountIn(List<BigDecimal> values) {
            addCriterion("order_income_amount in", values, "orderIncomeAmount");
            return (Criteria) this;
        }

        public Criteria andOrderIncomeAmountNotIn(List<BigDecimal> values) {
            addCriterion("order_income_amount not in", values, "orderIncomeAmount");
            return (Criteria) this;
        }

        public Criteria andOrderIncomeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_income_amount between", value1, value2, "orderIncomeAmount");
            return (Criteria) this;
        }

        public Criteria andOrderIncomeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_income_amount not between", value1, value2, "orderIncomeAmount");
            return (Criteria) this;
        }

        public Criteria andQualityAssuranceDaysIsNull() {
            addCriterion("quality_assurance_days is null");
            return (Criteria) this;
        }

        public Criteria andQualityAssuranceDaysIsNotNull() {
            addCriterion("quality_assurance_days is not null");
            return (Criteria) this;
        }

        public Criteria andQualityAssuranceDaysEqualTo(Integer value) {
            addCriterion("quality_assurance_days =", value, "qualityAssuranceDays");
            return (Criteria) this;
        }

        public Criteria andQualityAssuranceDaysNotEqualTo(Integer value) {
            addCriterion("quality_assurance_days <>", value, "qualityAssuranceDays");
            return (Criteria) this;
        }

        public Criteria andQualityAssuranceDaysGreaterThan(Integer value) {
            addCriterion("quality_assurance_days >", value, "qualityAssuranceDays");
            return (Criteria) this;
        }

        public Criteria andQualityAssuranceDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("quality_assurance_days >=", value, "qualityAssuranceDays");
            return (Criteria) this;
        }

        public Criteria andQualityAssuranceDaysLessThan(Integer value) {
            addCriterion("quality_assurance_days <", value, "qualityAssuranceDays");
            return (Criteria) this;
        }

        public Criteria andQualityAssuranceDaysLessThanOrEqualTo(Integer value) {
            addCriterion("quality_assurance_days <=", value, "qualityAssuranceDays");
            return (Criteria) this;
        }

        public Criteria andQualityAssuranceDaysIn(List<Integer> values) {
            addCriterion("quality_assurance_days in", values, "qualityAssuranceDays");
            return (Criteria) this;
        }

        public Criteria andQualityAssuranceDaysNotIn(List<Integer> values) {
            addCriterion("quality_assurance_days not in", values, "qualityAssuranceDays");
            return (Criteria) this;
        }

        public Criteria andQualityAssuranceDaysBetween(Integer value1, Integer value2) {
            addCriterion("quality_assurance_days between", value1, value2, "qualityAssuranceDays");
            return (Criteria) this;
        }

        public Criteria andQualityAssuranceDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("quality_assurance_days not between", value1, value2, "qualityAssuranceDays");
            return (Criteria) this;
        }

        public Criteria andIsTakingProductIsNull() {
            addCriterion("is_taking_product is null");
            return (Criteria) this;
        }

        public Criteria andIsTakingProductIsNotNull() {
            addCriterion("is_taking_product is not null");
            return (Criteria) this;
        }

        public Criteria andIsTakingProductEqualTo(String value) {
            addCriterion("is_taking_product =", value, "isTakingProduct");
            return (Criteria) this;
        }

        public Criteria andIsTakingProductNotEqualTo(String value) {
            addCriterion("is_taking_product <>", value, "isTakingProduct");
            return (Criteria) this;
        }

        public Criteria andIsTakingProductGreaterThan(String value) {
            addCriterion("is_taking_product >", value, "isTakingProduct");
            return (Criteria) this;
        }

        public Criteria andIsTakingProductGreaterThanOrEqualTo(String value) {
            addCriterion("is_taking_product >=", value, "isTakingProduct");
            return (Criteria) this;
        }

        public Criteria andIsTakingProductLessThan(String value) {
            addCriterion("is_taking_product <", value, "isTakingProduct");
            return (Criteria) this;
        }

        public Criteria andIsTakingProductLessThanOrEqualTo(String value) {
            addCriterion("is_taking_product <=", value, "isTakingProduct");
            return (Criteria) this;
        }

        public Criteria andIsTakingProductLike(String value) {
            addCriterion("is_taking_product like", value, "isTakingProduct");
            return (Criteria) this;
        }

        public Criteria andIsTakingProductNotLike(String value) {
            addCriterion("is_taking_product not like", value, "isTakingProduct");
            return (Criteria) this;
        }

        public Criteria andIsTakingProductIn(List<String> values) {
            addCriterion("is_taking_product in", values, "isTakingProduct");
            return (Criteria) this;
        }

        public Criteria andIsTakingProductNotIn(List<String> values) {
            addCriterion("is_taking_product not in", values, "isTakingProduct");
            return (Criteria) this;
        }

        public Criteria andIsTakingProductBetween(String value1, String value2) {
            addCriterion("is_taking_product between", value1, value2, "isTakingProduct");
            return (Criteria) this;
        }

        public Criteria andIsTakingProductNotBetween(String value1, String value2) {
            addCriterion("is_taking_product not between", value1, value2, "isTakingProduct");
            return (Criteria) this;
        }

        public Criteria andIsTakingGoodsIsNull() {
            addCriterion("is_taking_goods is null");
            return (Criteria) this;
        }

        public Criteria andIsTakingGoodsIsNotNull() {
            addCriterion("is_taking_goods is not null");
            return (Criteria) this;
        }

        public Criteria andIsTakingGoodsEqualTo(String value) {
            addCriterion("is_taking_goods =", value, "isTakingGoods");
            return (Criteria) this;
        }

        public Criteria andIsTakingGoodsNotEqualTo(String value) {
            addCriterion("is_taking_goods <>", value, "isTakingGoods");
            return (Criteria) this;
        }

        public Criteria andIsTakingGoodsGreaterThan(String value) {
            addCriterion("is_taking_goods >", value, "isTakingGoods");
            return (Criteria) this;
        }

        public Criteria andIsTakingGoodsGreaterThanOrEqualTo(String value) {
            addCriterion("is_taking_goods >=", value, "isTakingGoods");
            return (Criteria) this;
        }

        public Criteria andIsTakingGoodsLessThan(String value) {
            addCriterion("is_taking_goods <", value, "isTakingGoods");
            return (Criteria) this;
        }

        public Criteria andIsTakingGoodsLessThanOrEqualTo(String value) {
            addCriterion("is_taking_goods <=", value, "isTakingGoods");
            return (Criteria) this;
        }

        public Criteria andIsTakingGoodsLike(String value) {
            addCriterion("is_taking_goods like", value, "isTakingGoods");
            return (Criteria) this;
        }

        public Criteria andIsTakingGoodsNotLike(String value) {
            addCriterion("is_taking_goods not like", value, "isTakingGoods");
            return (Criteria) this;
        }

        public Criteria andIsTakingGoodsIn(List<String> values) {
            addCriterion("is_taking_goods in", values, "isTakingGoods");
            return (Criteria) this;
        }

        public Criteria andIsTakingGoodsNotIn(List<String> values) {
            addCriterion("is_taking_goods not in", values, "isTakingGoods");
            return (Criteria) this;
        }

        public Criteria andIsTakingGoodsBetween(String value1, String value2) {
            addCriterion("is_taking_goods between", value1, value2, "isTakingGoods");
            return (Criteria) this;
        }

        public Criteria andIsTakingGoodsNotBetween(String value1, String value2) {
            addCriterion("is_taking_goods not between", value1, value2, "isTakingGoods");
            return (Criteria) this;
        }

        public Criteria andIsCustomerPaymentIsNull() {
            addCriterion("is_customer_payment is null");
            return (Criteria) this;
        }

        public Criteria andIsCustomerPaymentIsNotNull() {
            addCriterion("is_customer_payment is not null");
            return (Criteria) this;
        }

        public Criteria andIsCustomerPaymentEqualTo(String value) {
            addCriterion("is_customer_payment =", value, "isCustomerPayment");
            return (Criteria) this;
        }

        public Criteria andIsCustomerPaymentNotEqualTo(String value) {
            addCriterion("is_customer_payment <>", value, "isCustomerPayment");
            return (Criteria) this;
        }

        public Criteria andIsCustomerPaymentGreaterThan(String value) {
            addCriterion("is_customer_payment >", value, "isCustomerPayment");
            return (Criteria) this;
        }

        public Criteria andIsCustomerPaymentGreaterThanOrEqualTo(String value) {
            addCriterion("is_customer_payment >=", value, "isCustomerPayment");
            return (Criteria) this;
        }

        public Criteria andIsCustomerPaymentLessThan(String value) {
            addCriterion("is_customer_payment <", value, "isCustomerPayment");
            return (Criteria) this;
        }

        public Criteria andIsCustomerPaymentLessThanOrEqualTo(String value) {
            addCriterion("is_customer_payment <=", value, "isCustomerPayment");
            return (Criteria) this;
        }

        public Criteria andIsCustomerPaymentLike(String value) {
            addCriterion("is_customer_payment like", value, "isCustomerPayment");
            return (Criteria) this;
        }

        public Criteria andIsCustomerPaymentNotLike(String value) {
            addCriterion("is_customer_payment not like", value, "isCustomerPayment");
            return (Criteria) this;
        }

        public Criteria andIsCustomerPaymentIn(List<String> values) {
            addCriterion("is_customer_payment in", values, "isCustomerPayment");
            return (Criteria) this;
        }

        public Criteria andIsCustomerPaymentNotIn(List<String> values) {
            addCriterion("is_customer_payment not in", values, "isCustomerPayment");
            return (Criteria) this;
        }

        public Criteria andIsCustomerPaymentBetween(String value1, String value2) {
            addCriterion("is_customer_payment between", value1, value2, "isCustomerPayment");
            return (Criteria) this;
        }

        public Criteria andIsCustomerPaymentNotBetween(String value1, String value2) {
            addCriterion("is_customer_payment not between", value1, value2, "isCustomerPayment");
            return (Criteria) this;
        }

        public Criteria andCustomerPaymentSuccessIsNull() {
            addCriterion("customer_payment_success is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPaymentSuccessIsNotNull() {
            addCriterion("customer_payment_success is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPaymentSuccessEqualTo(String value) {
            addCriterion("customer_payment_success =", value, "customerPaymentSuccess");
            return (Criteria) this;
        }

        public Criteria andCustomerPaymentSuccessNotEqualTo(String value) {
            addCriterion("customer_payment_success <>", value, "customerPaymentSuccess");
            return (Criteria) this;
        }

        public Criteria andCustomerPaymentSuccessGreaterThan(String value) {
            addCriterion("customer_payment_success >", value, "customerPaymentSuccess");
            return (Criteria) this;
        }

        public Criteria andCustomerPaymentSuccessGreaterThanOrEqualTo(String value) {
            addCriterion("customer_payment_success >=", value, "customerPaymentSuccess");
            return (Criteria) this;
        }

        public Criteria andCustomerPaymentSuccessLessThan(String value) {
            addCriterion("customer_payment_success <", value, "customerPaymentSuccess");
            return (Criteria) this;
        }

        public Criteria andCustomerPaymentSuccessLessThanOrEqualTo(String value) {
            addCriterion("customer_payment_success <=", value, "customerPaymentSuccess");
            return (Criteria) this;
        }

        public Criteria andCustomerPaymentSuccessLike(String value) {
            addCriterion("customer_payment_success like", value, "customerPaymentSuccess");
            return (Criteria) this;
        }

        public Criteria andCustomerPaymentSuccessNotLike(String value) {
            addCriterion("customer_payment_success not like", value, "customerPaymentSuccess");
            return (Criteria) this;
        }

        public Criteria andCustomerPaymentSuccessIn(List<String> values) {
            addCriterion("customer_payment_success in", values, "customerPaymentSuccess");
            return (Criteria) this;
        }

        public Criteria andCustomerPaymentSuccessNotIn(List<String> values) {
            addCriterion("customer_payment_success not in", values, "customerPaymentSuccess");
            return (Criteria) this;
        }

        public Criteria andCustomerPaymentSuccessBetween(String value1, String value2) {
            addCriterion("customer_payment_success between", value1, value2, "customerPaymentSuccess");
            return (Criteria) this;
        }

        public Criteria andCustomerPaymentSuccessNotBetween(String value1, String value2) {
            addCriterion("customer_payment_success not between", value1, value2, "customerPaymentSuccess");
            return (Criteria) this;
        }

        public Criteria andCustomerAdditionPaymentAmountIsNull() {
            addCriterion("customer_addition_payment_amount is null");
            return (Criteria) this;
        }

        public Criteria andCustomerAdditionPaymentAmountIsNotNull() {
            addCriterion("customer_addition_payment_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerAdditionPaymentAmountEqualTo(BigDecimal value) {
            addCriterion("customer_addition_payment_amount =", value, "customerAdditionPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerAdditionPaymentAmountNotEqualTo(BigDecimal value) {
            addCriterion("customer_addition_payment_amount <>", value, "customerAdditionPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerAdditionPaymentAmountGreaterThan(BigDecimal value) {
            addCriterion("customer_addition_payment_amount >", value, "customerAdditionPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerAdditionPaymentAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("customer_addition_payment_amount >=", value, "customerAdditionPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerAdditionPaymentAmountLessThan(BigDecimal value) {
            addCriterion("customer_addition_payment_amount <", value, "customerAdditionPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerAdditionPaymentAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("customer_addition_payment_amount <=", value, "customerAdditionPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerAdditionPaymentAmountIn(List<BigDecimal> values) {
            addCriterion("customer_addition_payment_amount in", values, "customerAdditionPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerAdditionPaymentAmountNotIn(List<BigDecimal> values) {
            addCriterion("customer_addition_payment_amount not in", values, "customerAdditionPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerAdditionPaymentAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("customer_addition_payment_amount between", value1, value2, "customerAdditionPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerAdditionPaymentAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("customer_addition_payment_amount not between", value1, value2, "customerAdditionPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerAdditionPaymentAmountNoteIsNull() {
            addCriterion("customer_addition_payment_amount_note is null");
            return (Criteria) this;
        }

        public Criteria andCustomerAdditionPaymentAmountNoteIsNotNull() {
            addCriterion("customer_addition_payment_amount_note is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerAdditionPaymentAmountNoteEqualTo(String value) {
            addCriterion("customer_addition_payment_amount_note =", value, "customerAdditionPaymentAmountNote");
            return (Criteria) this;
        }

        public Criteria andCustomerAdditionPaymentAmountNoteNotEqualTo(String value) {
            addCriterion("customer_addition_payment_amount_note <>", value, "customerAdditionPaymentAmountNote");
            return (Criteria) this;
        }

        public Criteria andCustomerAdditionPaymentAmountNoteGreaterThan(String value) {
            addCriterion("customer_addition_payment_amount_note >", value, "customerAdditionPaymentAmountNote");
            return (Criteria) this;
        }

        public Criteria andCustomerAdditionPaymentAmountNoteGreaterThanOrEqualTo(String value) {
            addCriterion("customer_addition_payment_amount_note >=", value, "customerAdditionPaymentAmountNote");
            return (Criteria) this;
        }

        public Criteria andCustomerAdditionPaymentAmountNoteLessThan(String value) {
            addCriterion("customer_addition_payment_amount_note <", value, "customerAdditionPaymentAmountNote");
            return (Criteria) this;
        }

        public Criteria andCustomerAdditionPaymentAmountNoteLessThanOrEqualTo(String value) {
            addCriterion("customer_addition_payment_amount_note <=", value, "customerAdditionPaymentAmountNote");
            return (Criteria) this;
        }

        public Criteria andCustomerAdditionPaymentAmountNoteLike(String value) {
            addCriterion("customer_addition_payment_amount_note like", value, "customerAdditionPaymentAmountNote");
            return (Criteria) this;
        }

        public Criteria andCustomerAdditionPaymentAmountNoteNotLike(String value) {
            addCriterion("customer_addition_payment_amount_note not like", value, "customerAdditionPaymentAmountNote");
            return (Criteria) this;
        }

        public Criteria andCustomerAdditionPaymentAmountNoteIn(List<String> values) {
            addCriterion("customer_addition_payment_amount_note in", values, "customerAdditionPaymentAmountNote");
            return (Criteria) this;
        }

        public Criteria andCustomerAdditionPaymentAmountNoteNotIn(List<String> values) {
            addCriterion("customer_addition_payment_amount_note not in", values, "customerAdditionPaymentAmountNote");
            return (Criteria) this;
        }

        public Criteria andCustomerAdditionPaymentAmountNoteBetween(String value1, String value2) {
            addCriterion("customer_addition_payment_amount_note between", value1, value2, "customerAdditionPaymentAmountNote");
            return (Criteria) this;
        }

        public Criteria andCustomerAdditionPaymentAmountNoteNotBetween(String value1, String value2) {
            addCriterion("customer_addition_payment_amount_note not between", value1, value2, "customerAdditionPaymentAmountNote");
            return (Criteria) this;
        }

        public Criteria andCustomerTotalPaymentAmountIsNull() {
            addCriterion("customer_total_payment_amount is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTotalPaymentAmountIsNotNull() {
            addCriterion("customer_total_payment_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTotalPaymentAmountEqualTo(BigDecimal value) {
            addCriterion("customer_total_payment_amount =", value, "customerTotalPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerTotalPaymentAmountNotEqualTo(BigDecimal value) {
            addCriterion("customer_total_payment_amount <>", value, "customerTotalPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerTotalPaymentAmountGreaterThan(BigDecimal value) {
            addCriterion("customer_total_payment_amount >", value, "customerTotalPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerTotalPaymentAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("customer_total_payment_amount >=", value, "customerTotalPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerTotalPaymentAmountLessThan(BigDecimal value) {
            addCriterion("customer_total_payment_amount <", value, "customerTotalPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerTotalPaymentAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("customer_total_payment_amount <=", value, "customerTotalPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerTotalPaymentAmountIn(List<BigDecimal> values) {
            addCriterion("customer_total_payment_amount in", values, "customerTotalPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerTotalPaymentAmountNotIn(List<BigDecimal> values) {
            addCriterion("customer_total_payment_amount not in", values, "customerTotalPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerTotalPaymentAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("customer_total_payment_amount between", value1, value2, "customerTotalPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerTotalPaymentAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("customer_total_payment_amount not between", value1, value2, "customerTotalPaymentAmount");
            return (Criteria) this;
        }

        public Criteria andIsAgentChargeIsNull() {
            addCriterion("is_agent_charge is null");
            return (Criteria) this;
        }

        public Criteria andIsAgentChargeIsNotNull() {
            addCriterion("is_agent_charge is not null");
            return (Criteria) this;
        }

        public Criteria andIsAgentChargeEqualTo(String value) {
            addCriterion("is_agent_charge =", value, "isAgentCharge");
            return (Criteria) this;
        }

        public Criteria andIsAgentChargeNotEqualTo(String value) {
            addCriterion("is_agent_charge <>", value, "isAgentCharge");
            return (Criteria) this;
        }

        public Criteria andIsAgentChargeGreaterThan(String value) {
            addCriterion("is_agent_charge >", value, "isAgentCharge");
            return (Criteria) this;
        }

        public Criteria andIsAgentChargeGreaterThanOrEqualTo(String value) {
            addCriterion("is_agent_charge >=", value, "isAgentCharge");
            return (Criteria) this;
        }

        public Criteria andIsAgentChargeLessThan(String value) {
            addCriterion("is_agent_charge <", value, "isAgentCharge");
            return (Criteria) this;
        }

        public Criteria andIsAgentChargeLessThanOrEqualTo(String value) {
            addCriterion("is_agent_charge <=", value, "isAgentCharge");
            return (Criteria) this;
        }

        public Criteria andIsAgentChargeLike(String value) {
            addCriterion("is_agent_charge like", value, "isAgentCharge");
            return (Criteria) this;
        }

        public Criteria andIsAgentChargeNotLike(String value) {
            addCriterion("is_agent_charge not like", value, "isAgentCharge");
            return (Criteria) this;
        }

        public Criteria andIsAgentChargeIn(List<String> values) {
            addCriterion("is_agent_charge in", values, "isAgentCharge");
            return (Criteria) this;
        }

        public Criteria andIsAgentChargeNotIn(List<String> values) {
            addCriterion("is_agent_charge not in", values, "isAgentCharge");
            return (Criteria) this;
        }

        public Criteria andIsAgentChargeBetween(String value1, String value2) {
            addCriterion("is_agent_charge between", value1, value2, "isAgentCharge");
            return (Criteria) this;
        }

        public Criteria andIsAgentChargeNotBetween(String value1, String value2) {
            addCriterion("is_agent_charge not between", value1, value2, "isAgentCharge");
            return (Criteria) this;
        }

        public Criteria andAgentChargeAmountIsNull() {
            addCriterion("agent_charge_amount is null");
            return (Criteria) this;
        }

        public Criteria andAgentChargeAmountIsNotNull() {
            addCriterion("agent_charge_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAgentChargeAmountEqualTo(BigDecimal value) {
            addCriterion("agent_charge_amount =", value, "agentChargeAmount");
            return (Criteria) this;
        }

        public Criteria andAgentChargeAmountNotEqualTo(BigDecimal value) {
            addCriterion("agent_charge_amount <>", value, "agentChargeAmount");
            return (Criteria) this;
        }

        public Criteria andAgentChargeAmountGreaterThan(BigDecimal value) {
            addCriterion("agent_charge_amount >", value, "agentChargeAmount");
            return (Criteria) this;
        }

        public Criteria andAgentChargeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("agent_charge_amount >=", value, "agentChargeAmount");
            return (Criteria) this;
        }

        public Criteria andAgentChargeAmountLessThan(BigDecimal value) {
            addCriterion("agent_charge_amount <", value, "agentChargeAmount");
            return (Criteria) this;
        }

        public Criteria andAgentChargeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("agent_charge_amount <=", value, "agentChargeAmount");
            return (Criteria) this;
        }

        public Criteria andAgentChargeAmountIn(List<BigDecimal> values) {
            addCriterion("agent_charge_amount in", values, "agentChargeAmount");
            return (Criteria) this;
        }

        public Criteria andAgentChargeAmountNotIn(List<BigDecimal> values) {
            addCriterion("agent_charge_amount not in", values, "agentChargeAmount");
            return (Criteria) this;
        }

        public Criteria andAgentChargeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("agent_charge_amount between", value1, value2, "agentChargeAmount");
            return (Criteria) this;
        }

        public Criteria andAgentChargeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("agent_charge_amount not between", value1, value2, "agentChargeAmount");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNumberIsNull() {
            addCriterion("delivery_order_number is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNumberIsNotNull() {
            addCriterion("delivery_order_number is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNumberEqualTo(String value) {
            addCriterion("delivery_order_number =", value, "deliveryOrderNumber");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNumberNotEqualTo(String value) {
            addCriterion("delivery_order_number <>", value, "deliveryOrderNumber");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNumberGreaterThan(String value) {
            addCriterion("delivery_order_number >", value, "deliveryOrderNumber");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNumberGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_order_number >=", value, "deliveryOrderNumber");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNumberLessThan(String value) {
            addCriterion("delivery_order_number <", value, "deliveryOrderNumber");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNumberLessThanOrEqualTo(String value) {
            addCriterion("delivery_order_number <=", value, "deliveryOrderNumber");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNumberLike(String value) {
            addCriterion("delivery_order_number like", value, "deliveryOrderNumber");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNumberNotLike(String value) {
            addCriterion("delivery_order_number not like", value, "deliveryOrderNumber");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNumberIn(List<String> values) {
            addCriterion("delivery_order_number in", values, "deliveryOrderNumber");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNumberNotIn(List<String> values) {
            addCriterion("delivery_order_number not in", values, "deliveryOrderNumber");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNumberBetween(String value1, String value2) {
            addCriterion("delivery_order_number between", value1, value2, "deliveryOrderNumber");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNumberNotBetween(String value1, String value2) {
            addCriterion("delivery_order_number not between", value1, value2, "deliveryOrderNumber");
            return (Criteria) this;
        }

        public Criteria andDeliveryReceiptUrlIsNull() {
            addCriterion("delivery_receipt_url is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryReceiptUrlIsNotNull() {
            addCriterion("delivery_receipt_url is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryReceiptUrlEqualTo(String value) {
            addCriterion("delivery_receipt_url =", value, "deliveryReceiptUrl");
            return (Criteria) this;
        }

        public Criteria andDeliveryReceiptUrlNotEqualTo(String value) {
            addCriterion("delivery_receipt_url <>", value, "deliveryReceiptUrl");
            return (Criteria) this;
        }

        public Criteria andDeliveryReceiptUrlGreaterThan(String value) {
            addCriterion("delivery_receipt_url >", value, "deliveryReceiptUrl");
            return (Criteria) this;
        }

        public Criteria andDeliveryReceiptUrlGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_receipt_url >=", value, "deliveryReceiptUrl");
            return (Criteria) this;
        }

        public Criteria andDeliveryReceiptUrlLessThan(String value) {
            addCriterion("delivery_receipt_url <", value, "deliveryReceiptUrl");
            return (Criteria) this;
        }

        public Criteria andDeliveryReceiptUrlLessThanOrEqualTo(String value) {
            addCriterion("delivery_receipt_url <=", value, "deliveryReceiptUrl");
            return (Criteria) this;
        }

        public Criteria andDeliveryReceiptUrlLike(String value) {
            addCriterion("delivery_receipt_url like", value, "deliveryReceiptUrl");
            return (Criteria) this;
        }

        public Criteria andDeliveryReceiptUrlNotLike(String value) {
            addCriterion("delivery_receipt_url not like", value, "deliveryReceiptUrl");
            return (Criteria) this;
        }

        public Criteria andDeliveryReceiptUrlIn(List<String> values) {
            addCriterion("delivery_receipt_url in", values, "deliveryReceiptUrl");
            return (Criteria) this;
        }

        public Criteria andDeliveryReceiptUrlNotIn(List<String> values) {
            addCriterion("delivery_receipt_url not in", values, "deliveryReceiptUrl");
            return (Criteria) this;
        }

        public Criteria andDeliveryReceiptUrlBetween(String value1, String value2) {
            addCriterion("delivery_receipt_url between", value1, value2, "deliveryReceiptUrl");
            return (Criteria) this;
        }

        public Criteria andDeliveryReceiptUrlNotBetween(String value1, String value2) {
            addCriterion("delivery_receipt_url not between", value1, value2, "deliveryReceiptUrl");
            return (Criteria) this;
        }

        public Criteria andDeliveryCompanyIdIsNull() {
            addCriterion("delivery_company_id is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryCompanyIdIsNotNull() {
            addCriterion("delivery_company_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryCompanyIdEqualTo(Integer value) {
            addCriterion("delivery_company_id =", value, "deliveryCompanyId");
            return (Criteria) this;
        }

        public Criteria andDeliveryCompanyIdNotEqualTo(Integer value) {
            addCriterion("delivery_company_id <>", value, "deliveryCompanyId");
            return (Criteria) this;
        }

        public Criteria andDeliveryCompanyIdGreaterThan(Integer value) {
            addCriterion("delivery_company_id >", value, "deliveryCompanyId");
            return (Criteria) this;
        }

        public Criteria andDeliveryCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("delivery_company_id >=", value, "deliveryCompanyId");
            return (Criteria) this;
        }

        public Criteria andDeliveryCompanyIdLessThan(Integer value) {
            addCriterion("delivery_company_id <", value, "deliveryCompanyId");
            return (Criteria) this;
        }

        public Criteria andDeliveryCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("delivery_company_id <=", value, "deliveryCompanyId");
            return (Criteria) this;
        }

        public Criteria andDeliveryCompanyIdIn(List<Integer> values) {
            addCriterion("delivery_company_id in", values, "deliveryCompanyId");
            return (Criteria) this;
        }

        public Criteria andDeliveryCompanyIdNotIn(List<Integer> values) {
            addCriterion("delivery_company_id not in", values, "deliveryCompanyId");
            return (Criteria) this;
        }

        public Criteria andDeliveryCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("delivery_company_id between", value1, value2, "deliveryCompanyId");
            return (Criteria) this;
        }

        public Criteria andDeliveryCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("delivery_company_id not between", value1, value2, "deliveryCompanyId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIsNull() {
            addCriterion("merchant_id is null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIsNotNull() {
            addCriterion("merchant_id is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdEqualTo(String value) {
            addCriterion("merchant_id =", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotEqualTo(String value) {
            addCriterion("merchant_id <>", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThan(String value) {
            addCriterion("merchant_id >", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_id >=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThan(String value) {
            addCriterion("merchant_id <", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThanOrEqualTo(String value) {
            addCriterion("merchant_id <=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLike(String value) {
            addCriterion("merchant_id like", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotLike(String value) {
            addCriterion("merchant_id not like", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIn(List<String> values) {
            addCriterion("merchant_id in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotIn(List<String> values) {
            addCriterion("merchant_id not in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdBetween(String value1, String value2) {
            addCriterion("merchant_id between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotBetween(String value1, String value2) {
            addCriterion("merchant_id not between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andDealerFullNameIsNull() {
            addCriterion("dealer_full_name is null");
            return (Criteria) this;
        }

        public Criteria andDealerFullNameIsNotNull() {
            addCriterion("dealer_full_name is not null");
            return (Criteria) this;
        }

        public Criteria andDealerFullNameEqualTo(String value) {
            addCriterion("dealer_full_name =", value, "dealerFullName");
            return (Criteria) this;
        }

        public Criteria andDealerFullNameNotEqualTo(String value) {
            addCriterion("dealer_full_name <>", value, "dealerFullName");
            return (Criteria) this;
        }

        public Criteria andDealerFullNameGreaterThan(String value) {
            addCriterion("dealer_full_name >", value, "dealerFullName");
            return (Criteria) this;
        }

        public Criteria andDealerFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("dealer_full_name >=", value, "dealerFullName");
            return (Criteria) this;
        }

        public Criteria andDealerFullNameLessThan(String value) {
            addCriterion("dealer_full_name <", value, "dealerFullName");
            return (Criteria) this;
        }

        public Criteria andDealerFullNameLessThanOrEqualTo(String value) {
            addCriterion("dealer_full_name <=", value, "dealerFullName");
            return (Criteria) this;
        }

        public Criteria andDealerFullNameLike(String value) {
            addCriterion("dealer_full_name like", value, "dealerFullName");
            return (Criteria) this;
        }

        public Criteria andDealerFullNameNotLike(String value) {
            addCriterion("dealer_full_name not like", value, "dealerFullName");
            return (Criteria) this;
        }

        public Criteria andDealerFullNameIn(List<String> values) {
            addCriterion("dealer_full_name in", values, "dealerFullName");
            return (Criteria) this;
        }

        public Criteria andDealerFullNameNotIn(List<String> values) {
            addCriterion("dealer_full_name not in", values, "dealerFullName");
            return (Criteria) this;
        }

        public Criteria andDealerFullNameBetween(String value1, String value2) {
            addCriterion("dealer_full_name between", value1, value2, "dealerFullName");
            return (Criteria) this;
        }

        public Criteria andDealerFullNameNotBetween(String value1, String value2) {
            addCriterion("dealer_full_name not between", value1, value2, "dealerFullName");
            return (Criteria) this;
        }

        public Criteria andArtisanLeaderIdIsNull() {
            addCriterion("artisan_leader_id is null");
            return (Criteria) this;
        }

        public Criteria andArtisanLeaderIdIsNotNull() {
            addCriterion("artisan_leader_id is not null");
            return (Criteria) this;
        }

        public Criteria andArtisanLeaderIdEqualTo(String value) {
            addCriterion("artisan_leader_id =", value, "artisanLeaderId");
            return (Criteria) this;
        }

        public Criteria andArtisanLeaderIdNotEqualTo(String value) {
            addCriterion("artisan_leader_id <>", value, "artisanLeaderId");
            return (Criteria) this;
        }

        public Criteria andArtisanLeaderIdGreaterThan(String value) {
            addCriterion("artisan_leader_id >", value, "artisanLeaderId");
            return (Criteria) this;
        }

        public Criteria andArtisanLeaderIdGreaterThanOrEqualTo(String value) {
            addCriterion("artisan_leader_id >=", value, "artisanLeaderId");
            return (Criteria) this;
        }

        public Criteria andArtisanLeaderIdLessThan(String value) {
            addCriterion("artisan_leader_id <", value, "artisanLeaderId");
            return (Criteria) this;
        }

        public Criteria andArtisanLeaderIdLessThanOrEqualTo(String value) {
            addCriterion("artisan_leader_id <=", value, "artisanLeaderId");
            return (Criteria) this;
        }

        public Criteria andArtisanLeaderIdLike(String value) {
            addCriterion("artisan_leader_id like", value, "artisanLeaderId");
            return (Criteria) this;
        }

        public Criteria andArtisanLeaderIdNotLike(String value) {
            addCriterion("artisan_leader_id not like", value, "artisanLeaderId");
            return (Criteria) this;
        }

        public Criteria andArtisanLeaderIdIn(List<String> values) {
            addCriterion("artisan_leader_id in", values, "artisanLeaderId");
            return (Criteria) this;
        }

        public Criteria andArtisanLeaderIdNotIn(List<String> values) {
            addCriterion("artisan_leader_id not in", values, "artisanLeaderId");
            return (Criteria) this;
        }

        public Criteria andArtisanLeaderIdBetween(String value1, String value2) {
            addCriterion("artisan_leader_id between", value1, value2, "artisanLeaderId");
            return (Criteria) this;
        }

        public Criteria andArtisanLeaderIdNotBetween(String value1, String value2) {
            addCriterion("artisan_leader_id not between", value1, value2, "artisanLeaderId");
            return (Criteria) this;
        }

        public Criteria andArtisanIdIsNull() {
            addCriterion("artisan_id is null");
            return (Criteria) this;
        }

        public Criteria andArtisanIdIsNotNull() {
            addCriterion("artisan_id is not null");
            return (Criteria) this;
        }

        public Criteria andArtisanIdEqualTo(String value) {
            addCriterion("artisan_id =", value, "artisanId");
            return (Criteria) this;
        }

        public Criteria andArtisanIdNotEqualTo(String value) {
            addCriterion("artisan_id <>", value, "artisanId");
            return (Criteria) this;
        }

        public Criteria andArtisanIdGreaterThan(String value) {
            addCriterion("artisan_id >", value, "artisanId");
            return (Criteria) this;
        }

        public Criteria andArtisanIdGreaterThanOrEqualTo(String value) {
            addCriterion("artisan_id >=", value, "artisanId");
            return (Criteria) this;
        }

        public Criteria andArtisanIdLessThan(String value) {
            addCriterion("artisan_id <", value, "artisanId");
            return (Criteria) this;
        }

        public Criteria andArtisanIdLessThanOrEqualTo(String value) {
            addCriterion("artisan_id <=", value, "artisanId");
            return (Criteria) this;
        }

        public Criteria andArtisanIdLike(String value) {
            addCriterion("artisan_id like", value, "artisanId");
            return (Criteria) this;
        }

        public Criteria andArtisanIdNotLike(String value) {
            addCriterion("artisan_id not like", value, "artisanId");
            return (Criteria) this;
        }

        public Criteria andArtisanIdIn(List<String> values) {
            addCriterion("artisan_id in", values, "artisanId");
            return (Criteria) this;
        }

        public Criteria andArtisanIdNotIn(List<String> values) {
            addCriterion("artisan_id not in", values, "artisanId");
            return (Criteria) this;
        }

        public Criteria andArtisanIdBetween(String value1, String value2) {
            addCriterion("artisan_id between", value1, value2, "artisanId");
            return (Criteria) this;
        }

        public Criteria andArtisanIdNotBetween(String value1, String value2) {
            addCriterion("artisan_id not between", value1, value2, "artisanId");
            return (Criteria) this;
        }

        public Criteria andStatusIdIsNull() {
            addCriterion("status_id is null");
            return (Criteria) this;
        }

        public Criteria andStatusIdIsNotNull() {
            addCriterion("status_id is not null");
            return (Criteria) this;
        }

        public Criteria andStatusIdEqualTo(Integer value) {
            addCriterion("status_id =", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotEqualTo(Integer value) {
            addCriterion("status_id <>", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdGreaterThan(Integer value) {
            addCriterion("status_id >", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("status_id >=", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLessThan(Integer value) {
            addCriterion("status_id <", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLessThanOrEqualTo(Integer value) {
            addCriterion("status_id <=", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdIn(List<Integer> values) {
            addCriterion("status_id in", values, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotIn(List<Integer> values) {
            addCriterion("status_id not in", values, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdBetween(Integer value1, Integer value2) {
            addCriterion("status_id between", value1, value2, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("status_id not between", value1, value2, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusBeginTimeIsNull() {
            addCriterion("status_begin_time is null");
            return (Criteria) this;
        }

        public Criteria andStatusBeginTimeIsNotNull() {
            addCriterion("status_begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andStatusBeginTimeEqualTo(Date value) {
            addCriterion("status_begin_time =", value, "statusBeginTime");
            return (Criteria) this;
        }

        public Criteria andStatusBeginTimeNotEqualTo(Date value) {
            addCriterion("status_begin_time <>", value, "statusBeginTime");
            return (Criteria) this;
        }

        public Criteria andStatusBeginTimeGreaterThan(Date value) {
            addCriterion("status_begin_time >", value, "statusBeginTime");
            return (Criteria) this;
        }

        public Criteria andStatusBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("status_begin_time >=", value, "statusBeginTime");
            return (Criteria) this;
        }

        public Criteria andStatusBeginTimeLessThan(Date value) {
            addCriterion("status_begin_time <", value, "statusBeginTime");
            return (Criteria) this;
        }

        public Criteria andStatusBeginTimeLessThanOrEqualTo(Date value) {
            addCriterion("status_begin_time <=", value, "statusBeginTime");
            return (Criteria) this;
        }

        public Criteria andStatusBeginTimeIn(List<Date> values) {
            addCriterion("status_begin_time in", values, "statusBeginTime");
            return (Criteria) this;
        }

        public Criteria andStatusBeginTimeNotIn(List<Date> values) {
            addCriterion("status_begin_time not in", values, "statusBeginTime");
            return (Criteria) this;
        }

        public Criteria andStatusBeginTimeBetween(Date value1, Date value2) {
            addCriterion("status_begin_time between", value1, value2, "statusBeginTime");
            return (Criteria) this;
        }

        public Criteria andStatusBeginTimeNotBetween(Date value1, Date value2) {
            addCriterion("status_begin_time not between", value1, value2, "statusBeginTime");
            return (Criteria) this;
        }

        public Criteria andIsWarningIsNull() {
            addCriterion("is_warning is null");
            return (Criteria) this;
        }

        public Criteria andIsWarningIsNotNull() {
            addCriterion("is_warning is not null");
            return (Criteria) this;
        }

        public Criteria andIsWarningEqualTo(String value) {
            addCriterion("is_warning =", value, "isWarning");
            return (Criteria) this;
        }

        public Criteria andIsWarningNotEqualTo(String value) {
            addCriterion("is_warning <>", value, "isWarning");
            return (Criteria) this;
        }

        public Criteria andIsWarningGreaterThan(String value) {
            addCriterion("is_warning >", value, "isWarning");
            return (Criteria) this;
        }

        public Criteria andIsWarningGreaterThanOrEqualTo(String value) {
            addCriterion("is_warning >=", value, "isWarning");
            return (Criteria) this;
        }

        public Criteria andIsWarningLessThan(String value) {
            addCriterion("is_warning <", value, "isWarning");
            return (Criteria) this;
        }

        public Criteria andIsWarningLessThanOrEqualTo(String value) {
            addCriterion("is_warning <=", value, "isWarning");
            return (Criteria) this;
        }

        public Criteria andIsWarningLike(String value) {
            addCriterion("is_warning like", value, "isWarning");
            return (Criteria) this;
        }

        public Criteria andIsWarningNotLike(String value) {
            addCriterion("is_warning not like", value, "isWarning");
            return (Criteria) this;
        }

        public Criteria andIsWarningIn(List<String> values) {
            addCriterion("is_warning in", values, "isWarning");
            return (Criteria) this;
        }

        public Criteria andIsWarningNotIn(List<String> values) {
            addCriterion("is_warning not in", values, "isWarning");
            return (Criteria) this;
        }

        public Criteria andIsWarningBetween(String value1, String value2) {
            addCriterion("is_warning between", value1, value2, "isWarning");
            return (Criteria) this;
        }

        public Criteria andIsWarningNotBetween(String value1, String value2) {
            addCriterion("is_warning not between", value1, value2, "isWarning");
            return (Criteria) this;
        }

        public Criteria andPendingProcessTimeIsNull() {
            addCriterion("pending_process_time is null");
            return (Criteria) this;
        }

        public Criteria andPendingProcessTimeIsNotNull() {
            addCriterion("pending_process_time is not null");
            return (Criteria) this;
        }

        public Criteria andPendingProcessTimeEqualTo(Date value) {
            addCriterion("pending_process_time =", value, "pendingProcessTime");
            return (Criteria) this;
        }

        public Criteria andPendingProcessTimeNotEqualTo(Date value) {
            addCriterion("pending_process_time <>", value, "pendingProcessTime");
            return (Criteria) this;
        }

        public Criteria andPendingProcessTimeGreaterThan(Date value) {
            addCriterion("pending_process_time >", value, "pendingProcessTime");
            return (Criteria) this;
        }

        public Criteria andPendingProcessTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pending_process_time >=", value, "pendingProcessTime");
            return (Criteria) this;
        }

        public Criteria andPendingProcessTimeLessThan(Date value) {
            addCriterion("pending_process_time <", value, "pendingProcessTime");
            return (Criteria) this;
        }

        public Criteria andPendingProcessTimeLessThanOrEqualTo(Date value) {
            addCriterion("pending_process_time <=", value, "pendingProcessTime");
            return (Criteria) this;
        }

        public Criteria andPendingProcessTimeIn(List<Date> values) {
            addCriterion("pending_process_time in", values, "pendingProcessTime");
            return (Criteria) this;
        }

        public Criteria andPendingProcessTimeNotIn(List<Date> values) {
            addCriterion("pending_process_time not in", values, "pendingProcessTime");
            return (Criteria) this;
        }

        public Criteria andPendingProcessTimeBetween(Date value1, Date value2) {
            addCriterion("pending_process_time between", value1, value2, "pendingProcessTime");
            return (Criteria) this;
        }

        public Criteria andPendingProcessTimeNotBetween(Date value1, Date value2) {
            addCriterion("pending_process_time not between", value1, value2, "pendingProcessTime");
            return (Criteria) this;
        }

        public Criteria andWaitingGrabProcesserIdIsNull() {
            addCriterion("waiting_grab_processer_id is null");
            return (Criteria) this;
        }

        public Criteria andWaitingGrabProcesserIdIsNotNull() {
            addCriterion("waiting_grab_processer_id is not null");
            return (Criteria) this;
        }

        public Criteria andWaitingGrabProcesserIdEqualTo(String value) {
            addCriterion("waiting_grab_processer_id =", value, "waitingGrabProcesserId");
            return (Criteria) this;
        }

        public Criteria andWaitingGrabProcesserIdNotEqualTo(String value) {
            addCriterion("waiting_grab_processer_id <>", value, "waitingGrabProcesserId");
            return (Criteria) this;
        }

        public Criteria andWaitingGrabProcesserIdGreaterThan(String value) {
            addCriterion("waiting_grab_processer_id >", value, "waitingGrabProcesserId");
            return (Criteria) this;
        }

        public Criteria andWaitingGrabProcesserIdGreaterThanOrEqualTo(String value) {
            addCriterion("waiting_grab_processer_id >=", value, "waitingGrabProcesserId");
            return (Criteria) this;
        }

        public Criteria andWaitingGrabProcesserIdLessThan(String value) {
            addCriterion("waiting_grab_processer_id <", value, "waitingGrabProcesserId");
            return (Criteria) this;
        }

        public Criteria andWaitingGrabProcesserIdLessThanOrEqualTo(String value) {
            addCriterion("waiting_grab_processer_id <=", value, "waitingGrabProcesserId");
            return (Criteria) this;
        }

        public Criteria andWaitingGrabProcesserIdLike(String value) {
            addCriterion("waiting_grab_processer_id like", value, "waitingGrabProcesserId");
            return (Criteria) this;
        }

        public Criteria andWaitingGrabProcesserIdNotLike(String value) {
            addCriterion("waiting_grab_processer_id not like", value, "waitingGrabProcesserId");
            return (Criteria) this;
        }

        public Criteria andWaitingGrabProcesserIdIn(List<String> values) {
            addCriterion("waiting_grab_processer_id in", values, "waitingGrabProcesserId");
            return (Criteria) this;
        }

        public Criteria andWaitingGrabProcesserIdNotIn(List<String> values) {
            addCriterion("waiting_grab_processer_id not in", values, "waitingGrabProcesserId");
            return (Criteria) this;
        }

        public Criteria andWaitingGrabProcesserIdBetween(String value1, String value2) {
            addCriterion("waiting_grab_processer_id between", value1, value2, "waitingGrabProcesserId");
            return (Criteria) this;
        }

        public Criteria andWaitingGrabProcesserIdNotBetween(String value1, String value2) {
            addCriterion("waiting_grab_processer_id not between", value1, value2, "waitingGrabProcesserId");
            return (Criteria) this;
        }

        public Criteria andWaitingGrabProcesserNameIsNull() {
            addCriterion("waiting_grab_processer_name is null");
            return (Criteria) this;
        }

        public Criteria andWaitingGrabProcesserNameIsNotNull() {
            addCriterion("waiting_grab_processer_name is not null");
            return (Criteria) this;
        }

        public Criteria andWaitingGrabProcesserNameEqualTo(String value) {
            addCriterion("waiting_grab_processer_name =", value, "waitingGrabProcesserName");
            return (Criteria) this;
        }

        public Criteria andWaitingGrabProcesserNameNotEqualTo(String value) {
            addCriterion("waiting_grab_processer_name <>", value, "waitingGrabProcesserName");
            return (Criteria) this;
        }

        public Criteria andWaitingGrabProcesserNameGreaterThan(String value) {
            addCriterion("waiting_grab_processer_name >", value, "waitingGrabProcesserName");
            return (Criteria) this;
        }

        public Criteria andWaitingGrabProcesserNameGreaterThanOrEqualTo(String value) {
            addCriterion("waiting_grab_processer_name >=", value, "waitingGrabProcesserName");
            return (Criteria) this;
        }

        public Criteria andWaitingGrabProcesserNameLessThan(String value) {
            addCriterion("waiting_grab_processer_name <", value, "waitingGrabProcesserName");
            return (Criteria) this;
        }

        public Criteria andWaitingGrabProcesserNameLessThanOrEqualTo(String value) {
            addCriterion("waiting_grab_processer_name <=", value, "waitingGrabProcesserName");
            return (Criteria) this;
        }

        public Criteria andWaitingGrabProcesserNameLike(String value) {
            addCriterion("waiting_grab_processer_name like", value, "waitingGrabProcesserName");
            return (Criteria) this;
        }

        public Criteria andWaitingGrabProcesserNameNotLike(String value) {
            addCriterion("waiting_grab_processer_name not like", value, "waitingGrabProcesserName");
            return (Criteria) this;
        }

        public Criteria andWaitingGrabProcesserNameIn(List<String> values) {
            addCriterion("waiting_grab_processer_name in", values, "waitingGrabProcesserName");
            return (Criteria) this;
        }

        public Criteria andWaitingGrabProcesserNameNotIn(List<String> values) {
            addCriterion("waiting_grab_processer_name not in", values, "waitingGrabProcesserName");
            return (Criteria) this;
        }

        public Criteria andWaitingGrabProcesserNameBetween(String value1, String value2) {
            addCriterion("waiting_grab_processer_name between", value1, value2, "waitingGrabProcesserName");
            return (Criteria) this;
        }

        public Criteria andWaitingGrabProcesserNameNotBetween(String value1, String value2) {
            addCriterion("waiting_grab_processer_name not between", value1, value2, "waitingGrabProcesserName");
            return (Criteria) this;
        }

        public Criteria andProcesserIdIsNull() {
            addCriterion("processer_id is null");
            return (Criteria) this;
        }

        public Criteria andProcesserIdIsNotNull() {
            addCriterion("processer_id is not null");
            return (Criteria) this;
        }

        public Criteria andProcesserIdEqualTo(String value) {
            addCriterion("processer_id =", value, "processerId");
            return (Criteria) this;
        }

        public Criteria andProcesserIdNotEqualTo(String value) {
            addCriterion("processer_id <>", value, "processerId");
            return (Criteria) this;
        }

        public Criteria andProcesserIdGreaterThan(String value) {
            addCriterion("processer_id >", value, "processerId");
            return (Criteria) this;
        }

        public Criteria andProcesserIdGreaterThanOrEqualTo(String value) {
            addCriterion("processer_id >=", value, "processerId");
            return (Criteria) this;
        }

        public Criteria andProcesserIdLessThan(String value) {
            addCriterion("processer_id <", value, "processerId");
            return (Criteria) this;
        }

        public Criteria andProcesserIdLessThanOrEqualTo(String value) {
            addCriterion("processer_id <=", value, "processerId");
            return (Criteria) this;
        }

        public Criteria andProcesserIdLike(String value) {
            addCriterion("processer_id like", value, "processerId");
            return (Criteria) this;
        }

        public Criteria andProcesserIdNotLike(String value) {
            addCriterion("processer_id not like", value, "processerId");
            return (Criteria) this;
        }

        public Criteria andProcesserIdIn(List<String> values) {
            addCriterion("processer_id in", values, "processerId");
            return (Criteria) this;
        }

        public Criteria andProcesserIdNotIn(List<String> values) {
            addCriterion("processer_id not in", values, "processerId");
            return (Criteria) this;
        }

        public Criteria andProcesserIdBetween(String value1, String value2) {
            addCriterion("processer_id between", value1, value2, "processerId");
            return (Criteria) this;
        }

        public Criteria andProcesserIdNotBetween(String value1, String value2) {
            addCriterion("processer_id not between", value1, value2, "processerId");
            return (Criteria) this;
        }

        public Criteria andProcesserNameIsNull() {
            addCriterion("processer_name is null");
            return (Criteria) this;
        }

        public Criteria andProcesserNameIsNotNull() {
            addCriterion("processer_name is not null");
            return (Criteria) this;
        }

        public Criteria andProcesserNameEqualTo(String value) {
            addCriterion("processer_name =", value, "processerName");
            return (Criteria) this;
        }

        public Criteria andProcesserNameNotEqualTo(String value) {
            addCriterion("processer_name <>", value, "processerName");
            return (Criteria) this;
        }

        public Criteria andProcesserNameGreaterThan(String value) {
            addCriterion("processer_name >", value, "processerName");
            return (Criteria) this;
        }

        public Criteria andProcesserNameGreaterThanOrEqualTo(String value) {
            addCriterion("processer_name >=", value, "processerName");
            return (Criteria) this;
        }

        public Criteria andProcesserNameLessThan(String value) {
            addCriterion("processer_name <", value, "processerName");
            return (Criteria) this;
        }

        public Criteria andProcesserNameLessThanOrEqualTo(String value) {
            addCriterion("processer_name <=", value, "processerName");
            return (Criteria) this;
        }

        public Criteria andProcesserNameLike(String value) {
            addCriterion("processer_name like", value, "processerName");
            return (Criteria) this;
        }

        public Criteria andProcesserNameNotLike(String value) {
            addCriterion("processer_name not like", value, "processerName");
            return (Criteria) this;
        }

        public Criteria andProcesserNameIn(List<String> values) {
            addCriterion("processer_name in", values, "processerName");
            return (Criteria) this;
        }

        public Criteria andProcesserNameNotIn(List<String> values) {
            addCriterion("processer_name not in", values, "processerName");
            return (Criteria) this;
        }

        public Criteria andProcesserNameBetween(String value1, String value2) {
            addCriterion("processer_name between", value1, value2, "processerName");
            return (Criteria) this;
        }

        public Criteria andProcesserNameNotBetween(String value1, String value2) {
            addCriterion("processer_name not between", value1, value2, "processerName");
            return (Criteria) this;
        }

        public Criteria andMarkupNumberIsNull() {
            addCriterion("markup_number is null");
            return (Criteria) this;
        }

        public Criteria andMarkupNumberIsNotNull() {
            addCriterion("markup_number is not null");
            return (Criteria) this;
        }

        public Criteria andMarkupNumberEqualTo(Integer value) {
            addCriterion("markup_number =", value, "markupNumber");
            return (Criteria) this;
        }

        public Criteria andMarkupNumberNotEqualTo(Integer value) {
            addCriterion("markup_number <>", value, "markupNumber");
            return (Criteria) this;
        }

        public Criteria andMarkupNumberGreaterThan(Integer value) {
            addCriterion("markup_number >", value, "markupNumber");
            return (Criteria) this;
        }

        public Criteria andMarkupNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("markup_number >=", value, "markupNumber");
            return (Criteria) this;
        }

        public Criteria andMarkupNumberLessThan(Integer value) {
            addCriterion("markup_number <", value, "markupNumber");
            return (Criteria) this;
        }

        public Criteria andMarkupNumberLessThanOrEqualTo(Integer value) {
            addCriterion("markup_number <=", value, "markupNumber");
            return (Criteria) this;
        }

        public Criteria andMarkupNumberIn(List<Integer> values) {
            addCriterion("markup_number in", values, "markupNumber");
            return (Criteria) this;
        }

        public Criteria andMarkupNumberNotIn(List<Integer> values) {
            addCriterion("markup_number not in", values, "markupNumber");
            return (Criteria) this;
        }

        public Criteria andMarkupNumberBetween(Integer value1, Integer value2) {
            addCriterion("markup_number between", value1, value2, "markupNumber");
            return (Criteria) this;
        }

        public Criteria andMarkupNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("markup_number not between", value1, value2, "markupNumber");
            return (Criteria) this;
        }

        public Criteria andMarkupIntervalMinutesIsNull() {
            addCriterion("markup_interval_minutes is null");
            return (Criteria) this;
        }

        public Criteria andMarkupIntervalMinutesIsNotNull() {
            addCriterion("markup_interval_minutes is not null");
            return (Criteria) this;
        }

        public Criteria andMarkupIntervalMinutesEqualTo(Integer value) {
            addCriterion("markup_interval_minutes =", value, "markupIntervalMinutes");
            return (Criteria) this;
        }

        public Criteria andMarkupIntervalMinutesNotEqualTo(Integer value) {
            addCriterion("markup_interval_minutes <>", value, "markupIntervalMinutes");
            return (Criteria) this;
        }

        public Criteria andMarkupIntervalMinutesGreaterThan(Integer value) {
            addCriterion("markup_interval_minutes >", value, "markupIntervalMinutes");
            return (Criteria) this;
        }

        public Criteria andMarkupIntervalMinutesGreaterThanOrEqualTo(Integer value) {
            addCriterion("markup_interval_minutes >=", value, "markupIntervalMinutes");
            return (Criteria) this;
        }

        public Criteria andMarkupIntervalMinutesLessThan(Integer value) {
            addCriterion("markup_interval_minutes <", value, "markupIntervalMinutes");
            return (Criteria) this;
        }

        public Criteria andMarkupIntervalMinutesLessThanOrEqualTo(Integer value) {
            addCriterion("markup_interval_minutes <=", value, "markupIntervalMinutes");
            return (Criteria) this;
        }

        public Criteria andMarkupIntervalMinutesIn(List<Integer> values) {
            addCriterion("markup_interval_minutes in", values, "markupIntervalMinutes");
            return (Criteria) this;
        }

        public Criteria andMarkupIntervalMinutesNotIn(List<Integer> values) {
            addCriterion("markup_interval_minutes not in", values, "markupIntervalMinutes");
            return (Criteria) this;
        }

        public Criteria andMarkupIntervalMinutesBetween(Integer value1, Integer value2) {
            addCriterion("markup_interval_minutes between", value1, value2, "markupIntervalMinutes");
            return (Criteria) this;
        }

        public Criteria andMarkupIntervalMinutesNotBetween(Integer value1, Integer value2) {
            addCriterion("markup_interval_minutes not between", value1, value2, "markupIntervalMinutes");
            return (Criteria) this;
        }

        public Criteria andMarkupAmountIsNull() {
            addCriterion("markup_amount is null");
            return (Criteria) this;
        }

        public Criteria andMarkupAmountIsNotNull() {
            addCriterion("markup_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMarkupAmountEqualTo(BigDecimal value) {
            addCriterion("markup_amount =", value, "markupAmount");
            return (Criteria) this;
        }

        public Criteria andMarkupAmountNotEqualTo(BigDecimal value) {
            addCriterion("markup_amount <>", value, "markupAmount");
            return (Criteria) this;
        }

        public Criteria andMarkupAmountGreaterThan(BigDecimal value) {
            addCriterion("markup_amount >", value, "markupAmount");
            return (Criteria) this;
        }

        public Criteria andMarkupAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("markup_amount >=", value, "markupAmount");
            return (Criteria) this;
        }

        public Criteria andMarkupAmountLessThan(BigDecimal value) {
            addCriterion("markup_amount <", value, "markupAmount");
            return (Criteria) this;
        }

        public Criteria andMarkupAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("markup_amount <=", value, "markupAmount");
            return (Criteria) this;
        }

        public Criteria andMarkupAmountIn(List<BigDecimal> values) {
            addCriterion("markup_amount in", values, "markupAmount");
            return (Criteria) this;
        }

        public Criteria andMarkupAmountNotIn(List<BigDecimal> values) {
            addCriterion("markup_amount not in", values, "markupAmount");
            return (Criteria) this;
        }

        public Criteria andMarkupAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("markup_amount between", value1, value2, "markupAmount");
            return (Criteria) this;
        }

        public Criteria andMarkupAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("markup_amount not between", value1, value2, "markupAmount");
            return (Criteria) this;
        }

        public Criteria andCreatedByIdIsNull() {
            addCriterion("created_by_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIdIsNotNull() {
            addCriterion("created_by_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIdEqualTo(String value) {
            addCriterion("created_by_id =", value, "createdById");
            return (Criteria) this;
        }

        public Criteria andCreatedByIdNotEqualTo(String value) {
            addCriterion("created_by_id <>", value, "createdById");
            return (Criteria) this;
        }

        public Criteria andCreatedByIdGreaterThan(String value) {
            addCriterion("created_by_id >", value, "createdById");
            return (Criteria) this;
        }

        public Criteria andCreatedByIdGreaterThanOrEqualTo(String value) {
            addCriterion("created_by_id >=", value, "createdById");
            return (Criteria) this;
        }

        public Criteria andCreatedByIdLessThan(String value) {
            addCriterion("created_by_id <", value, "createdById");
            return (Criteria) this;
        }

        public Criteria andCreatedByIdLessThanOrEqualTo(String value) {
            addCriterion("created_by_id <=", value, "createdById");
            return (Criteria) this;
        }

        public Criteria andCreatedByIdLike(String value) {
            addCriterion("created_by_id like", value, "createdById");
            return (Criteria) this;
        }

        public Criteria andCreatedByIdNotLike(String value) {
            addCriterion("created_by_id not like", value, "createdById");
            return (Criteria) this;
        }

        public Criteria andCreatedByIdIn(List<String> values) {
            addCriterion("created_by_id in", values, "createdById");
            return (Criteria) this;
        }

        public Criteria andCreatedByIdNotIn(List<String> values) {
            addCriterion("created_by_id not in", values, "createdById");
            return (Criteria) this;
        }

        public Criteria andCreatedByIdBetween(String value1, String value2) {
            addCriterion("created_by_id between", value1, value2, "createdById");
            return (Criteria) this;
        }

        public Criteria andCreatedByIdNotBetween(String value1, String value2) {
            addCriterion("created_by_id not between", value1, value2, "createdById");
            return (Criteria) this;
        }

        public Criteria andCreatedAccountTypeIdIsNull() {
            addCriterion("created_account_type_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAccountTypeIdIsNotNull() {
            addCriterion("created_account_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAccountTypeIdEqualTo(Integer value) {
            addCriterion("created_account_type_id =", value, "createdAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andCreatedAccountTypeIdNotEqualTo(Integer value) {
            addCriterion("created_account_type_id <>", value, "createdAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andCreatedAccountTypeIdGreaterThan(Integer value) {
            addCriterion("created_account_type_id >", value, "createdAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andCreatedAccountTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("created_account_type_id >=", value, "createdAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andCreatedAccountTypeIdLessThan(Integer value) {
            addCriterion("created_account_type_id <", value, "createdAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andCreatedAccountTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("created_account_type_id <=", value, "createdAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andCreatedAccountTypeIdIn(List<Integer> values) {
            addCriterion("created_account_type_id in", values, "createdAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andCreatedAccountTypeIdNotIn(List<Integer> values) {
            addCriterion("created_account_type_id not in", values, "createdAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andCreatedAccountTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("created_account_type_id between", value1, value2, "createdAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andCreatedAccountTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("created_account_type_id not between", value1, value2, "createdAccountTypeId");
            return (Criteria) this;
        }

        public Criteria andVisibilityIdIsNull() {
            addCriterion("visibility_id is null");
            return (Criteria) this;
        }

        public Criteria andVisibilityIdIsNotNull() {
            addCriterion("visibility_id is not null");
            return (Criteria) this;
        }

        public Criteria andVisibilityIdEqualTo(Integer value) {
            addCriterion("visibility_id =", value, "visibilityId");
            return (Criteria) this;
        }

        public Criteria andVisibilityIdNotEqualTo(Integer value) {
            addCriterion("visibility_id <>", value, "visibilityId");
            return (Criteria) this;
        }

        public Criteria andVisibilityIdGreaterThan(Integer value) {
            addCriterion("visibility_id >", value, "visibilityId");
            return (Criteria) this;
        }

        public Criteria andVisibilityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("visibility_id >=", value, "visibilityId");
            return (Criteria) this;
        }

        public Criteria andVisibilityIdLessThan(Integer value) {
            addCriterion("visibility_id <", value, "visibilityId");
            return (Criteria) this;
        }

        public Criteria andVisibilityIdLessThanOrEqualTo(Integer value) {
            addCriterion("visibility_id <=", value, "visibilityId");
            return (Criteria) this;
        }

        public Criteria andVisibilityIdIn(List<Integer> values) {
            addCriterion("visibility_id in", values, "visibilityId");
            return (Criteria) this;
        }

        public Criteria andVisibilityIdNotIn(List<Integer> values) {
            addCriterion("visibility_id not in", values, "visibilityId");
            return (Criteria) this;
        }

        public Criteria andVisibilityIdBetween(Integer value1, Integer value2) {
            addCriterion("visibility_id between", value1, value2, "visibilityId");
            return (Criteria) this;
        }

        public Criteria andVisibilityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("visibility_id not between", value1, value2, "visibilityId");
            return (Criteria) this;
        }

        public Criteria andProcessStepCodeIsNull() {
            addCriterion("process_step_code is null");
            return (Criteria) this;
        }

        public Criteria andProcessStepCodeIsNotNull() {
            addCriterion("process_step_code is not null");
            return (Criteria) this;
        }

        public Criteria andProcessStepCodeEqualTo(String value) {
            addCriterion("process_step_code =", value, "processStepCode");
            return (Criteria) this;
        }

        public Criteria andProcessStepCodeNotEqualTo(String value) {
            addCriterion("process_step_code <>", value, "processStepCode");
            return (Criteria) this;
        }

        public Criteria andProcessStepCodeGreaterThan(String value) {
            addCriterion("process_step_code >", value, "processStepCode");
            return (Criteria) this;
        }

        public Criteria andProcessStepCodeGreaterThanOrEqualTo(String value) {
            addCriterion("process_step_code >=", value, "processStepCode");
            return (Criteria) this;
        }

        public Criteria andProcessStepCodeLessThan(String value) {
            addCriterion("process_step_code <", value, "processStepCode");
            return (Criteria) this;
        }

        public Criteria andProcessStepCodeLessThanOrEqualTo(String value) {
            addCriterion("process_step_code <=", value, "processStepCode");
            return (Criteria) this;
        }

        public Criteria andProcessStepCodeLike(String value) {
            addCriterion("process_step_code like", value, "processStepCode");
            return (Criteria) this;
        }

        public Criteria andProcessStepCodeNotLike(String value) {
            addCriterion("process_step_code not like", value, "processStepCode");
            return (Criteria) this;
        }

        public Criteria andProcessStepCodeIn(List<String> values) {
            addCriterion("process_step_code in", values, "processStepCode");
            return (Criteria) this;
        }

        public Criteria andProcessStepCodeNotIn(List<String> values) {
            addCriterion("process_step_code not in", values, "processStepCode");
            return (Criteria) this;
        }

        public Criteria andProcessStepCodeBetween(String value1, String value2) {
            addCriterion("process_step_code between", value1, value2, "processStepCode");
            return (Criteria) this;
        }

        public Criteria andProcessStepCodeNotBetween(String value1, String value2) {
            addCriterion("process_step_code not between", value1, value2, "processStepCode");
            return (Criteria) this;
        }

        public Criteria andPerProcessStepProcessCountIsNull() {
            addCriterion("per_process_step_process_count is null");
            return (Criteria) this;
        }

        public Criteria andPerProcessStepProcessCountIsNotNull() {
            addCriterion("per_process_step_process_count is not null");
            return (Criteria) this;
        }

        public Criteria andPerProcessStepProcessCountEqualTo(Integer value) {
            addCriterion("per_process_step_process_count =", value, "perProcessStepProcessCount");
            return (Criteria) this;
        }

        public Criteria andPerProcessStepProcessCountNotEqualTo(Integer value) {
            addCriterion("per_process_step_process_count <>", value, "perProcessStepProcessCount");
            return (Criteria) this;
        }

        public Criteria andPerProcessStepProcessCountGreaterThan(Integer value) {
            addCriterion("per_process_step_process_count >", value, "perProcessStepProcessCount");
            return (Criteria) this;
        }

        public Criteria andPerProcessStepProcessCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("per_process_step_process_count >=", value, "perProcessStepProcessCount");
            return (Criteria) this;
        }

        public Criteria andPerProcessStepProcessCountLessThan(Integer value) {
            addCriterion("per_process_step_process_count <", value, "perProcessStepProcessCount");
            return (Criteria) this;
        }

        public Criteria andPerProcessStepProcessCountLessThanOrEqualTo(Integer value) {
            addCriterion("per_process_step_process_count <=", value, "perProcessStepProcessCount");
            return (Criteria) this;
        }

        public Criteria andPerProcessStepProcessCountIn(List<Integer> values) {
            addCriterion("per_process_step_process_count in", values, "perProcessStepProcessCount");
            return (Criteria) this;
        }

        public Criteria andPerProcessStepProcessCountNotIn(List<Integer> values) {
            addCriterion("per_process_step_process_count not in", values, "perProcessStepProcessCount");
            return (Criteria) this;
        }

        public Criteria andPerProcessStepProcessCountBetween(Integer value1, Integer value2) {
            addCriterion("per_process_step_process_count between", value1, value2, "perProcessStepProcessCount");
            return (Criteria) this;
        }

        public Criteria andPerProcessStepProcessCountNotBetween(Integer value1, Integer value2) {
            addCriterion("per_process_step_process_count not between", value1, value2, "perProcessStepProcessCount");
            return (Criteria) this;
        }

        public Criteria andIsCustomerReminderIsNull() {
            addCriterion("is_customer_reminder is null");
            return (Criteria) this;
        }

        public Criteria andIsCustomerReminderIsNotNull() {
            addCriterion("is_customer_reminder is not null");
            return (Criteria) this;
        }

        public Criteria andIsCustomerReminderEqualTo(String value) {
            addCriterion("is_customer_reminder =", value, "isCustomerReminder");
            return (Criteria) this;
        }

        public Criteria andIsCustomerReminderNotEqualTo(String value) {
            addCriterion("is_customer_reminder <>", value, "isCustomerReminder");
            return (Criteria) this;
        }

        public Criteria andIsCustomerReminderGreaterThan(String value) {
            addCriterion("is_customer_reminder >", value, "isCustomerReminder");
            return (Criteria) this;
        }

        public Criteria andIsCustomerReminderGreaterThanOrEqualTo(String value) {
            addCriterion("is_customer_reminder >=", value, "isCustomerReminder");
            return (Criteria) this;
        }

        public Criteria andIsCustomerReminderLessThan(String value) {
            addCriterion("is_customer_reminder <", value, "isCustomerReminder");
            return (Criteria) this;
        }

        public Criteria andIsCustomerReminderLessThanOrEqualTo(String value) {
            addCriterion("is_customer_reminder <=", value, "isCustomerReminder");
            return (Criteria) this;
        }

        public Criteria andIsCustomerReminderLike(String value) {
            addCriterion("is_customer_reminder like", value, "isCustomerReminder");
            return (Criteria) this;
        }

        public Criteria andIsCustomerReminderNotLike(String value) {
            addCriterion("is_customer_reminder not like", value, "isCustomerReminder");
            return (Criteria) this;
        }

        public Criteria andIsCustomerReminderIn(List<String> values) {
            addCriterion("is_customer_reminder in", values, "isCustomerReminder");
            return (Criteria) this;
        }

        public Criteria andIsCustomerReminderNotIn(List<String> values) {
            addCriterion("is_customer_reminder not in", values, "isCustomerReminder");
            return (Criteria) this;
        }

        public Criteria andIsCustomerReminderBetween(String value1, String value2) {
            addCriterion("is_customer_reminder between", value1, value2, "isCustomerReminder");
            return (Criteria) this;
        }

        public Criteria andIsCustomerReminderNotBetween(String value1, String value2) {
            addCriterion("is_customer_reminder not between", value1, value2, "isCustomerReminder");
            return (Criteria) this;
        }

        public Criteria andCustomerReminderTimeIsNull() {
            addCriterion("customer_reminder_time is null");
            return (Criteria) this;
        }

        public Criteria andCustomerReminderTimeIsNotNull() {
            addCriterion("customer_reminder_time is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerReminderTimeEqualTo(Date value) {
            addCriterion("customer_reminder_time =", value, "customerReminderTime");
            return (Criteria) this;
        }

        public Criteria andCustomerReminderTimeNotEqualTo(Date value) {
            addCriterion("customer_reminder_time <>", value, "customerReminderTime");
            return (Criteria) this;
        }

        public Criteria andCustomerReminderTimeGreaterThan(Date value) {
            addCriterion("customer_reminder_time >", value, "customerReminderTime");
            return (Criteria) this;
        }

        public Criteria andCustomerReminderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("customer_reminder_time >=", value, "customerReminderTime");
            return (Criteria) this;
        }

        public Criteria andCustomerReminderTimeLessThan(Date value) {
            addCriterion("customer_reminder_time <", value, "customerReminderTime");
            return (Criteria) this;
        }

        public Criteria andCustomerReminderTimeLessThanOrEqualTo(Date value) {
            addCriterion("customer_reminder_time <=", value, "customerReminderTime");
            return (Criteria) this;
        }

        public Criteria andCustomerReminderTimeIn(List<Date> values) {
            addCriterion("customer_reminder_time in", values, "customerReminderTime");
            return (Criteria) this;
        }

        public Criteria andCustomerReminderTimeNotIn(List<Date> values) {
            addCriterion("customer_reminder_time not in", values, "customerReminderTime");
            return (Criteria) this;
        }

        public Criteria andCustomerReminderTimeBetween(Date value1, Date value2) {
            addCriterion("customer_reminder_time between", value1, value2, "customerReminderTime");
            return (Criteria) this;
        }

        public Criteria andCustomerReminderTimeNotBetween(Date value1, Date value2) {
            addCriterion("customer_reminder_time not between", value1, value2, "customerReminderTime");
            return (Criteria) this;
        }

        public Criteria andIsConformVisitConditionIsNull() {
            addCriterion("is_conform_visit_condition is null");
            return (Criteria) this;
        }

        public Criteria andIsConformVisitConditionIsNotNull() {
            addCriterion("is_conform_visit_condition is not null");
            return (Criteria) this;
        }

        public Criteria andIsConformVisitConditionEqualTo(String value) {
            addCriterion("is_conform_visit_condition =", value, "isConformVisitCondition");
            return (Criteria) this;
        }

        public Criteria andIsConformVisitConditionNotEqualTo(String value) {
            addCriterion("is_conform_visit_condition <>", value, "isConformVisitCondition");
            return (Criteria) this;
        }

        public Criteria andIsConformVisitConditionGreaterThan(String value) {
            addCriterion("is_conform_visit_condition >", value, "isConformVisitCondition");
            return (Criteria) this;
        }

        public Criteria andIsConformVisitConditionGreaterThanOrEqualTo(String value) {
            addCriterion("is_conform_visit_condition >=", value, "isConformVisitCondition");
            return (Criteria) this;
        }

        public Criteria andIsConformVisitConditionLessThan(String value) {
            addCriterion("is_conform_visit_condition <", value, "isConformVisitCondition");
            return (Criteria) this;
        }

        public Criteria andIsConformVisitConditionLessThanOrEqualTo(String value) {
            addCriterion("is_conform_visit_condition <=", value, "isConformVisitCondition");
            return (Criteria) this;
        }

        public Criteria andIsConformVisitConditionLike(String value) {
            addCriterion("is_conform_visit_condition like", value, "isConformVisitCondition");
            return (Criteria) this;
        }

        public Criteria andIsConformVisitConditionNotLike(String value) {
            addCriterion("is_conform_visit_condition not like", value, "isConformVisitCondition");
            return (Criteria) this;
        }

        public Criteria andIsConformVisitConditionIn(List<String> values) {
            addCriterion("is_conform_visit_condition in", values, "isConformVisitCondition");
            return (Criteria) this;
        }

        public Criteria andIsConformVisitConditionNotIn(List<String> values) {
            addCriterion("is_conform_visit_condition not in", values, "isConformVisitCondition");
            return (Criteria) this;
        }

        public Criteria andIsConformVisitConditionBetween(String value1, String value2) {
            addCriterion("is_conform_visit_condition between", value1, value2, "isConformVisitCondition");
            return (Criteria) this;
        }

        public Criteria andIsConformVisitConditionNotBetween(String value1, String value2) {
            addCriterion("is_conform_visit_condition not between", value1, value2, "isConformVisitCondition");
            return (Criteria) this;
        }

        public Criteria andConformVisitConditionTimeIsNull() {
            addCriterion("conform_visit_condition_time is null");
            return (Criteria) this;
        }

        public Criteria andConformVisitConditionTimeIsNotNull() {
            addCriterion("conform_visit_condition_time is not null");
            return (Criteria) this;
        }

        public Criteria andConformVisitConditionTimeEqualTo(Date value) {
            addCriterion("conform_visit_condition_time =", value, "conformVisitConditionTime");
            return (Criteria) this;
        }

        public Criteria andConformVisitConditionTimeNotEqualTo(Date value) {
            addCriterion("conform_visit_condition_time <>", value, "conformVisitConditionTime");
            return (Criteria) this;
        }

        public Criteria andConformVisitConditionTimeGreaterThan(Date value) {
            addCriterion("conform_visit_condition_time >", value, "conformVisitConditionTime");
            return (Criteria) this;
        }

        public Criteria andConformVisitConditionTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("conform_visit_condition_time >=", value, "conformVisitConditionTime");
            return (Criteria) this;
        }

        public Criteria andConformVisitConditionTimeLessThan(Date value) {
            addCriterion("conform_visit_condition_time <", value, "conformVisitConditionTime");
            return (Criteria) this;
        }

        public Criteria andConformVisitConditionTimeLessThanOrEqualTo(Date value) {
            addCriterion("conform_visit_condition_time <=", value, "conformVisitConditionTime");
            return (Criteria) this;
        }

        public Criteria andConformVisitConditionTimeIn(List<Date> values) {
            addCriterion("conform_visit_condition_time in", values, "conformVisitConditionTime");
            return (Criteria) this;
        }

        public Criteria andConformVisitConditionTimeNotIn(List<Date> values) {
            addCriterion("conform_visit_condition_time not in", values, "conformVisitConditionTime");
            return (Criteria) this;
        }

        public Criteria andConformVisitConditionTimeBetween(Date value1, Date value2) {
            addCriterion("conform_visit_condition_time between", value1, value2, "conformVisitConditionTime");
            return (Criteria) this;
        }

        public Criteria andConformVisitConditionTimeNotBetween(Date value1, Date value2) {
            addCriterion("conform_visit_condition_time not between", value1, value2, "conformVisitConditionTime");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("channel like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("channel not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("channel not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelOrderNumberIsNull() {
            addCriterion("channel_order_number is null");
            return (Criteria) this;
        }

        public Criteria andChannelOrderNumberIsNotNull() {
            addCriterion("channel_order_number is not null");
            return (Criteria) this;
        }

        public Criteria andChannelOrderNumberEqualTo(String value) {
            addCriterion("channel_order_number =", value, "channelOrderNumber");
            return (Criteria) this;
        }

        public Criteria andChannelOrderNumberNotEqualTo(String value) {
            addCriterion("channel_order_number <>", value, "channelOrderNumber");
            return (Criteria) this;
        }

        public Criteria andChannelOrderNumberGreaterThan(String value) {
            addCriterion("channel_order_number >", value, "channelOrderNumber");
            return (Criteria) this;
        }

        public Criteria andChannelOrderNumberGreaterThanOrEqualTo(String value) {
            addCriterion("channel_order_number >=", value, "channelOrderNumber");
            return (Criteria) this;
        }

        public Criteria andChannelOrderNumberLessThan(String value) {
            addCriterion("channel_order_number <", value, "channelOrderNumber");
            return (Criteria) this;
        }

        public Criteria andChannelOrderNumberLessThanOrEqualTo(String value) {
            addCriterion("channel_order_number <=", value, "channelOrderNumber");
            return (Criteria) this;
        }

        public Criteria andChannelOrderNumberLike(String value) {
            addCriterion("channel_order_number like", value, "channelOrderNumber");
            return (Criteria) this;
        }

        public Criteria andChannelOrderNumberNotLike(String value) {
            addCriterion("channel_order_number not like", value, "channelOrderNumber");
            return (Criteria) this;
        }

        public Criteria andChannelOrderNumberIn(List<String> values) {
            addCriterion("channel_order_number in", values, "channelOrderNumber");
            return (Criteria) this;
        }

        public Criteria andChannelOrderNumberNotIn(List<String> values) {
            addCriterion("channel_order_number not in", values, "channelOrderNumber");
            return (Criteria) this;
        }

        public Criteria andChannelOrderNumberBetween(String value1, String value2) {
            addCriterion("channel_order_number between", value1, value2, "channelOrderNumber");
            return (Criteria) this;
        }

        public Criteria andChannelOrderNumberNotBetween(String value1, String value2) {
            addCriterion("channel_order_number not between", value1, value2, "channelOrderNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerChannelAccountIsNull() {
            addCriterion("customer_channel_account is null");
            return (Criteria) this;
        }

        public Criteria andCustomerChannelAccountIsNotNull() {
            addCriterion("customer_channel_account is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerChannelAccountEqualTo(String value) {
            addCriterion("customer_channel_account =", value, "customerChannelAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerChannelAccountNotEqualTo(String value) {
            addCriterion("customer_channel_account <>", value, "customerChannelAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerChannelAccountGreaterThan(String value) {
            addCriterion("customer_channel_account >", value, "customerChannelAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerChannelAccountGreaterThanOrEqualTo(String value) {
            addCriterion("customer_channel_account >=", value, "customerChannelAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerChannelAccountLessThan(String value) {
            addCriterion("customer_channel_account <", value, "customerChannelAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerChannelAccountLessThanOrEqualTo(String value) {
            addCriterion("customer_channel_account <=", value, "customerChannelAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerChannelAccountLike(String value) {
            addCriterion("customer_channel_account like", value, "customerChannelAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerChannelAccountNotLike(String value) {
            addCriterion("customer_channel_account not like", value, "customerChannelAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerChannelAccountIn(List<String> values) {
            addCriterion("customer_channel_account in", values, "customerChannelAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerChannelAccountNotIn(List<String> values) {
            addCriterion("customer_channel_account not in", values, "customerChannelAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerChannelAccountBetween(String value1, String value2) {
            addCriterion("customer_channel_account between", value1, value2, "customerChannelAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerChannelAccountNotBetween(String value1, String value2) {
            addCriterion("customer_channel_account not between", value1, value2, "customerChannelAccount");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeTimeStartIsNull() {
            addCriterion("final_agree_time_start is null");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeTimeStartIsNotNull() {
            addCriterion("final_agree_time_start is not null");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeTimeStartEqualTo(Date value) {
            addCriterionForJDBCTime("final_agree_time_start =", value, "finalAgreeTimeStart");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeTimeStartNotEqualTo(Date value) {
            addCriterionForJDBCTime("final_agree_time_start <>", value, "finalAgreeTimeStart");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeTimeStartGreaterThan(Date value) {
            addCriterionForJDBCTime("final_agree_time_start >", value, "finalAgreeTimeStart");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeTimeStartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("final_agree_time_start >=", value, "finalAgreeTimeStart");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeTimeStartLessThan(Date value) {
            addCriterionForJDBCTime("final_agree_time_start <", value, "finalAgreeTimeStart");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeTimeStartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("final_agree_time_start <=", value, "finalAgreeTimeStart");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeTimeStartIn(List<Date> values) {
            addCriterionForJDBCTime("final_agree_time_start in", values, "finalAgreeTimeStart");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeTimeStartNotIn(List<Date> values) {
            addCriterionForJDBCTime("final_agree_time_start not in", values, "finalAgreeTimeStart");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeTimeStartBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("final_agree_time_start between", value1, value2, "finalAgreeTimeStart");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeTimeStartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("final_agree_time_start not between", value1, value2, "finalAgreeTimeStart");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeTimeEndIsNull() {
            addCriterion("final_agree_time_end is null");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeTimeEndIsNotNull() {
            addCriterion("final_agree_time_end is not null");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeTimeEndEqualTo(Date value) {
            addCriterionForJDBCTime("final_agree_time_end =", value, "finalAgreeTimeEnd");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeTimeEndNotEqualTo(Date value) {
            addCriterionForJDBCTime("final_agree_time_end <>", value, "finalAgreeTimeEnd");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeTimeEndGreaterThan(Date value) {
            addCriterionForJDBCTime("final_agree_time_end >", value, "finalAgreeTimeEnd");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeTimeEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("final_agree_time_end >=", value, "finalAgreeTimeEnd");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeTimeEndLessThan(Date value) {
            addCriterionForJDBCTime("final_agree_time_end <", value, "finalAgreeTimeEnd");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeTimeEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("final_agree_time_end <=", value, "finalAgreeTimeEnd");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeTimeEndIn(List<Date> values) {
            addCriterionForJDBCTime("final_agree_time_end in", values, "finalAgreeTimeEnd");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeTimeEndNotIn(List<Date> values) {
            addCriterionForJDBCTime("final_agree_time_end not in", values, "finalAgreeTimeEnd");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeTimeEndBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("final_agree_time_end between", value1, value2, "finalAgreeTimeEnd");
            return (Criteria) this;
        }

        public Criteria andFinalAgreeTimeEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("final_agree_time_end not between", value1, value2, "finalAgreeTimeEnd");
            return (Criteria) this;
        }

        public Criteria andIsCheckoutOfflineIsNull() {
            addCriterion("is_checkout_offline is null");
            return (Criteria) this;
        }

        public Criteria andIsCheckoutOfflineIsNotNull() {
            addCriterion("is_checkout_offline is not null");
            return (Criteria) this;
        }

        public Criteria andIsCheckoutOfflineEqualTo(String value) {
            addCriterion("is_checkout_offline =", value, "isCheckoutOffline");
            return (Criteria) this;
        }

        public Criteria andIsCheckoutOfflineNotEqualTo(String value) {
            addCriterion("is_checkout_offline <>", value, "isCheckoutOffline");
            return (Criteria) this;
        }

        public Criteria andIsCheckoutOfflineGreaterThan(String value) {
            addCriterion("is_checkout_offline >", value, "isCheckoutOffline");
            return (Criteria) this;
        }

        public Criteria andIsCheckoutOfflineGreaterThanOrEqualTo(String value) {
            addCriterion("is_checkout_offline >=", value, "isCheckoutOffline");
            return (Criteria) this;
        }

        public Criteria andIsCheckoutOfflineLessThan(String value) {
            addCriterion("is_checkout_offline <", value, "isCheckoutOffline");
            return (Criteria) this;
        }

        public Criteria andIsCheckoutOfflineLessThanOrEqualTo(String value) {
            addCriterion("is_checkout_offline <=", value, "isCheckoutOffline");
            return (Criteria) this;
        }

        public Criteria andIsCheckoutOfflineLike(String value) {
            addCriterion("is_checkout_offline like", value, "isCheckoutOffline");
            return (Criteria) this;
        }

        public Criteria andIsCheckoutOfflineNotLike(String value) {
            addCriterion("is_checkout_offline not like", value, "isCheckoutOffline");
            return (Criteria) this;
        }

        public Criteria andIsCheckoutOfflineIn(List<String> values) {
            addCriterion("is_checkout_offline in", values, "isCheckoutOffline");
            return (Criteria) this;
        }

        public Criteria andIsCheckoutOfflineNotIn(List<String> values) {
            addCriterion("is_checkout_offline not in", values, "isCheckoutOffline");
            return (Criteria) this;
        }

        public Criteria andIsCheckoutOfflineBetween(String value1, String value2) {
            addCriterion("is_checkout_offline between", value1, value2, "isCheckoutOffline");
            return (Criteria) this;
        }

        public Criteria andIsCheckoutOfflineNotBetween(String value1, String value2) {
            addCriterion("is_checkout_offline not between", value1, value2, "isCheckoutOffline");
            return (Criteria) this;
        }

        public Criteria andReimbursementArtisanIdIsNull() {
            addCriterion("reimbursement_artisan_id is null");
            return (Criteria) this;
        }

        public Criteria andReimbursementArtisanIdIsNotNull() {
            addCriterion("reimbursement_artisan_id is not null");
            return (Criteria) this;
        }

        public Criteria andReimbursementArtisanIdEqualTo(String value) {
            addCriterion("reimbursement_artisan_id =", value, "reimbursementArtisanId");
            return (Criteria) this;
        }

        public Criteria andReimbursementArtisanIdNotEqualTo(String value) {
            addCriterion("reimbursement_artisan_id <>", value, "reimbursementArtisanId");
            return (Criteria) this;
        }

        public Criteria andReimbursementArtisanIdGreaterThan(String value) {
            addCriterion("reimbursement_artisan_id >", value, "reimbursementArtisanId");
            return (Criteria) this;
        }

        public Criteria andReimbursementArtisanIdGreaterThanOrEqualTo(String value) {
            addCriterion("reimbursement_artisan_id >=", value, "reimbursementArtisanId");
            return (Criteria) this;
        }

        public Criteria andReimbursementArtisanIdLessThan(String value) {
            addCriterion("reimbursement_artisan_id <", value, "reimbursementArtisanId");
            return (Criteria) this;
        }

        public Criteria andReimbursementArtisanIdLessThanOrEqualTo(String value) {
            addCriterion("reimbursement_artisan_id <=", value, "reimbursementArtisanId");
            return (Criteria) this;
        }

        public Criteria andReimbursementArtisanIdLike(String value) {
            addCriterion("reimbursement_artisan_id like", value, "reimbursementArtisanId");
            return (Criteria) this;
        }

        public Criteria andReimbursementArtisanIdNotLike(String value) {
            addCriterion("reimbursement_artisan_id not like", value, "reimbursementArtisanId");
            return (Criteria) this;
        }

        public Criteria andReimbursementArtisanIdIn(List<String> values) {
            addCriterion("reimbursement_artisan_id in", values, "reimbursementArtisanId");
            return (Criteria) this;
        }

        public Criteria andReimbursementArtisanIdNotIn(List<String> values) {
            addCriterion("reimbursement_artisan_id not in", values, "reimbursementArtisanId");
            return (Criteria) this;
        }

        public Criteria andReimbursementArtisanIdBetween(String value1, String value2) {
            addCriterion("reimbursement_artisan_id between", value1, value2, "reimbursementArtisanId");
            return (Criteria) this;
        }

        public Criteria andReimbursementArtisanIdNotBetween(String value1, String value2) {
            addCriterion("reimbursement_artisan_id not between", value1, value2, "reimbursementArtisanId");
            return (Criteria) this;
        }

        public Criteria andServeArtisanPhoneNumberIsNull() {
            addCriterion("serve_artisan_phone_number is null");
            return (Criteria) this;
        }

        public Criteria andServeArtisanPhoneNumberIsNotNull() {
            addCriterion("serve_artisan_phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andServeArtisanPhoneNumberEqualTo(String value) {
            addCriterion("serve_artisan_phone_number =", value, "serveArtisanPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andServeArtisanPhoneNumberNotEqualTo(String value) {
            addCriterion("serve_artisan_phone_number <>", value, "serveArtisanPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andServeArtisanPhoneNumberGreaterThan(String value) {
            addCriterion("serve_artisan_phone_number >", value, "serveArtisanPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andServeArtisanPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("serve_artisan_phone_number >=", value, "serveArtisanPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andServeArtisanPhoneNumberLessThan(String value) {
            addCriterion("serve_artisan_phone_number <", value, "serveArtisanPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andServeArtisanPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("serve_artisan_phone_number <=", value, "serveArtisanPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andServeArtisanPhoneNumberLike(String value) {
            addCriterion("serve_artisan_phone_number like", value, "serveArtisanPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andServeArtisanPhoneNumberNotLike(String value) {
            addCriterion("serve_artisan_phone_number not like", value, "serveArtisanPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andServeArtisanPhoneNumberIn(List<String> values) {
            addCriterion("serve_artisan_phone_number in", values, "serveArtisanPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andServeArtisanPhoneNumberNotIn(List<String> values) {
            addCriterion("serve_artisan_phone_number not in", values, "serveArtisanPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andServeArtisanPhoneNumberBetween(String value1, String value2) {
            addCriterion("serve_artisan_phone_number between", value1, value2, "serveArtisanPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andServeArtisanPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("serve_artisan_phone_number not between", value1, value2, "serveArtisanPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andIsCityPartnerCreatedIsNull() {
            addCriterion("is_city_partner_created is null");
            return (Criteria) this;
        }

        public Criteria andIsCityPartnerCreatedIsNotNull() {
            addCriterion("is_city_partner_created is not null");
            return (Criteria) this;
        }

        public Criteria andIsCityPartnerCreatedEqualTo(String value) {
            addCriterion("is_city_partner_created =", value, "isCityPartnerCreated");
            return (Criteria) this;
        }

        public Criteria andIsCityPartnerCreatedNotEqualTo(String value) {
            addCriterion("is_city_partner_created <>", value, "isCityPartnerCreated");
            return (Criteria) this;
        }

        public Criteria andIsCityPartnerCreatedGreaterThan(String value) {
            addCriterion("is_city_partner_created >", value, "isCityPartnerCreated");
            return (Criteria) this;
        }

        public Criteria andIsCityPartnerCreatedGreaterThanOrEqualTo(String value) {
            addCriterion("is_city_partner_created >=", value, "isCityPartnerCreated");
            return (Criteria) this;
        }

        public Criteria andIsCityPartnerCreatedLessThan(String value) {
            addCriterion("is_city_partner_created <", value, "isCityPartnerCreated");
            return (Criteria) this;
        }

        public Criteria andIsCityPartnerCreatedLessThanOrEqualTo(String value) {
            addCriterion("is_city_partner_created <=", value, "isCityPartnerCreated");
            return (Criteria) this;
        }

        public Criteria andIsCityPartnerCreatedLike(String value) {
            addCriterion("is_city_partner_created like", value, "isCityPartnerCreated");
            return (Criteria) this;
        }

        public Criteria andIsCityPartnerCreatedNotLike(String value) {
            addCriterion("is_city_partner_created not like", value, "isCityPartnerCreated");
            return (Criteria) this;
        }

        public Criteria andIsCityPartnerCreatedIn(List<String> values) {
            addCriterion("is_city_partner_created in", values, "isCityPartnerCreated");
            return (Criteria) this;
        }

        public Criteria andIsCityPartnerCreatedNotIn(List<String> values) {
            addCriterion("is_city_partner_created not in", values, "isCityPartnerCreated");
            return (Criteria) this;
        }

        public Criteria andIsCityPartnerCreatedBetween(String value1, String value2) {
            addCriterion("is_city_partner_created between", value1, value2, "isCityPartnerCreated");
            return (Criteria) this;
        }

        public Criteria andIsCityPartnerCreatedNotBetween(String value1, String value2) {
            addCriterion("is_city_partner_created not between", value1, value2, "isCityPartnerCreated");
            return (Criteria) this;
        }

        public Criteria andMerchantTypeIsNull() {
            addCriterion("merchant_type is null");
            return (Criteria) this;
        }

        public Criteria andMerchantTypeIsNotNull() {
            addCriterion("merchant_type is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantTypeEqualTo(String value) {
            addCriterion("merchant_type =", value, "merchantType");
            return (Criteria) this;
        }

        public Criteria andMerchantTypeNotEqualTo(String value) {
            addCriterion("merchant_type <>", value, "merchantType");
            return (Criteria) this;
        }

        public Criteria andMerchantTypeGreaterThan(String value) {
            addCriterion("merchant_type >", value, "merchantType");
            return (Criteria) this;
        }

        public Criteria andMerchantTypeGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_type >=", value, "merchantType");
            return (Criteria) this;
        }

        public Criteria andMerchantTypeLessThan(String value) {
            addCriterion("merchant_type <", value, "merchantType");
            return (Criteria) this;
        }

        public Criteria andMerchantTypeLessThanOrEqualTo(String value) {
            addCriterion("merchant_type <=", value, "merchantType");
            return (Criteria) this;
        }

        public Criteria andMerchantTypeLike(String value) {
            addCriterion("merchant_type like", value, "merchantType");
            return (Criteria) this;
        }

        public Criteria andMerchantTypeNotLike(String value) {
            addCriterion("merchant_type not like", value, "merchantType");
            return (Criteria) this;
        }

        public Criteria andMerchantTypeIn(List<String> values) {
            addCriterion("merchant_type in", values, "merchantType");
            return (Criteria) this;
        }

        public Criteria andMerchantTypeNotIn(List<String> values) {
            addCriterion("merchant_type not in", values, "merchantType");
            return (Criteria) this;
        }

        public Criteria andMerchantTypeBetween(String value1, String value2) {
            addCriterion("merchant_type between", value1, value2, "merchantType");
            return (Criteria) this;
        }

        public Criteria andMerchantTypeNotBetween(String value1, String value2) {
            addCriterion("merchant_type not between", value1, value2, "merchantType");
            return (Criteria) this;
        }

        public Criteria andServiceProviderIdIsNull() {
            addCriterion("service_provider_id is null");
            return (Criteria) this;
        }

        public Criteria andServiceProviderIdIsNotNull() {
            addCriterion("service_provider_id is not null");
            return (Criteria) this;
        }

        public Criteria andServiceProviderIdEqualTo(String value) {
            addCriterion("service_provider_id =", value, "serviceProviderId");
            return (Criteria) this;
        }

        public Criteria andServiceProviderIdNotEqualTo(String value) {
            addCriterion("service_provider_id <>", value, "serviceProviderId");
            return (Criteria) this;
        }

        public Criteria andServiceProviderIdGreaterThan(String value) {
            addCriterion("service_provider_id >", value, "serviceProviderId");
            return (Criteria) this;
        }

        public Criteria andServiceProviderIdGreaterThanOrEqualTo(String value) {
            addCriterion("service_provider_id >=", value, "serviceProviderId");
            return (Criteria) this;
        }

        public Criteria andServiceProviderIdLessThan(String value) {
            addCriterion("service_provider_id <", value, "serviceProviderId");
            return (Criteria) this;
        }

        public Criteria andServiceProviderIdLessThanOrEqualTo(String value) {
            addCriterion("service_provider_id <=", value, "serviceProviderId");
            return (Criteria) this;
        }

        public Criteria andServiceProviderIdLike(String value) {
            addCriterion("service_provider_id like", value, "serviceProviderId");
            return (Criteria) this;
        }

        public Criteria andServiceProviderIdNotLike(String value) {
            addCriterion("service_provider_id not like", value, "serviceProviderId");
            return (Criteria) this;
        }

        public Criteria andServiceProviderIdIn(List<String> values) {
            addCriterion("service_provider_id in", values, "serviceProviderId");
            return (Criteria) this;
        }

        public Criteria andServiceProviderIdNotIn(List<String> values) {
            addCriterion("service_provider_id not in", values, "serviceProviderId");
            return (Criteria) this;
        }

        public Criteria andServiceProviderIdBetween(String value1, String value2) {
            addCriterion("service_provider_id between", value1, value2, "serviceProviderId");
            return (Criteria) this;
        }

        public Criteria andServiceProviderIdNotBetween(String value1, String value2) {
            addCriterion("service_provider_id not between", value1, value2, "serviceProviderId");
            return (Criteria) this;
        }

        public Criteria andServiceProviderNameIsNull() {
            addCriterion("service_provider_name is null");
            return (Criteria) this;
        }

        public Criteria andServiceProviderNameIsNotNull() {
            addCriterion("service_provider_name is not null");
            return (Criteria) this;
        }

        public Criteria andServiceProviderNameEqualTo(String value) {
            addCriterion("service_provider_name =", value, "serviceProviderName");
            return (Criteria) this;
        }

        public Criteria andServiceProviderNameNotEqualTo(String value) {
            addCriterion("service_provider_name <>", value, "serviceProviderName");
            return (Criteria) this;
        }

        public Criteria andServiceProviderNameGreaterThan(String value) {
            addCriterion("service_provider_name >", value, "serviceProviderName");
            return (Criteria) this;
        }

        public Criteria andServiceProviderNameGreaterThanOrEqualTo(String value) {
            addCriterion("service_provider_name >=", value, "serviceProviderName");
            return (Criteria) this;
        }

        public Criteria andServiceProviderNameLessThan(String value) {
            addCriterion("service_provider_name <", value, "serviceProviderName");
            return (Criteria) this;
        }

        public Criteria andServiceProviderNameLessThanOrEqualTo(String value) {
            addCriterion("service_provider_name <=", value, "serviceProviderName");
            return (Criteria) this;
        }

        public Criteria andServiceProviderNameLike(String value) {
            addCriterion("service_provider_name like", value, "serviceProviderName");
            return (Criteria) this;
        }

        public Criteria andServiceProviderNameNotLike(String value) {
            addCriterion("service_provider_name not like", value, "serviceProviderName");
            return (Criteria) this;
        }

        public Criteria andServiceProviderNameIn(List<String> values) {
            addCriterion("service_provider_name in", values, "serviceProviderName");
            return (Criteria) this;
        }

        public Criteria andServiceProviderNameNotIn(List<String> values) {
            addCriterion("service_provider_name not in", values, "serviceProviderName");
            return (Criteria) this;
        }

        public Criteria andServiceProviderNameBetween(String value1, String value2) {
            addCriterion("service_provider_name between", value1, value2, "serviceProviderName");
            return (Criteria) this;
        }

        public Criteria andServiceProviderNameNotBetween(String value1, String value2) {
            addCriterion("service_provider_name not between", value1, value2, "serviceProviderName");
            return (Criteria) this;
        }

        public Criteria andIsDefaultServiceProviderIsNull() {
            addCriterion("is_default_service_provider is null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultServiceProviderIsNotNull() {
            addCriterion("is_default_service_provider is not null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultServiceProviderEqualTo(String value) {
            addCriterion("is_default_service_provider =", value, "isDefaultServiceProvider");
            return (Criteria) this;
        }

        public Criteria andIsDefaultServiceProviderNotEqualTo(String value) {
            addCriterion("is_default_service_provider <>", value, "isDefaultServiceProvider");
            return (Criteria) this;
        }

        public Criteria andIsDefaultServiceProviderGreaterThan(String value) {
            addCriterion("is_default_service_provider >", value, "isDefaultServiceProvider");
            return (Criteria) this;
        }

        public Criteria andIsDefaultServiceProviderGreaterThanOrEqualTo(String value) {
            addCriterion("is_default_service_provider >=", value, "isDefaultServiceProvider");
            return (Criteria) this;
        }

        public Criteria andIsDefaultServiceProviderLessThan(String value) {
            addCriterion("is_default_service_provider <", value, "isDefaultServiceProvider");
            return (Criteria) this;
        }

        public Criteria andIsDefaultServiceProviderLessThanOrEqualTo(String value) {
            addCriterion("is_default_service_provider <=", value, "isDefaultServiceProvider");
            return (Criteria) this;
        }

        public Criteria andIsDefaultServiceProviderLike(String value) {
            addCriterion("is_default_service_provider like", value, "isDefaultServiceProvider");
            return (Criteria) this;
        }

        public Criteria andIsDefaultServiceProviderNotLike(String value) {
            addCriterion("is_default_service_provider not like", value, "isDefaultServiceProvider");
            return (Criteria) this;
        }

        public Criteria andIsDefaultServiceProviderIn(List<String> values) {
            addCriterion("is_default_service_provider in", values, "isDefaultServiceProvider");
            return (Criteria) this;
        }

        public Criteria andIsDefaultServiceProviderNotIn(List<String> values) {
            addCriterion("is_default_service_provider not in", values, "isDefaultServiceProvider");
            return (Criteria) this;
        }

        public Criteria andIsDefaultServiceProviderBetween(String value1, String value2) {
            addCriterion("is_default_service_provider between", value1, value2, "isDefaultServiceProvider");
            return (Criteria) this;
        }

        public Criteria andIsDefaultServiceProviderNotBetween(String value1, String value2) {
            addCriterion("is_default_service_provider not between", value1, value2, "isDefaultServiceProvider");
            return (Criteria) this;
        }

        public Criteria andIsRedPacketUsedIsNull() {
            addCriterion("is_red_packet_used is null");
            return (Criteria) this;
        }

        public Criteria andIsRedPacketUsedIsNotNull() {
            addCriterion("is_red_packet_used is not null");
            return (Criteria) this;
        }

        public Criteria andIsRedPacketUsedEqualTo(String value) {
            addCriterion("is_red_packet_used =", value, "isRedPacketUsed");
            return (Criteria) this;
        }

        public Criteria andIsRedPacketUsedNotEqualTo(String value) {
            addCriterion("is_red_packet_used <>", value, "isRedPacketUsed");
            return (Criteria) this;
        }

        public Criteria andIsRedPacketUsedGreaterThan(String value) {
            addCriterion("is_red_packet_used >", value, "isRedPacketUsed");
            return (Criteria) this;
        }

        public Criteria andIsRedPacketUsedGreaterThanOrEqualTo(String value) {
            addCriterion("is_red_packet_used >=", value, "isRedPacketUsed");
            return (Criteria) this;
        }

        public Criteria andIsRedPacketUsedLessThan(String value) {
            addCriterion("is_red_packet_used <", value, "isRedPacketUsed");
            return (Criteria) this;
        }

        public Criteria andIsRedPacketUsedLessThanOrEqualTo(String value) {
            addCriterion("is_red_packet_used <=", value, "isRedPacketUsed");
            return (Criteria) this;
        }

        public Criteria andIsRedPacketUsedLike(String value) {
            addCriterion("is_red_packet_used like", value, "isRedPacketUsed");
            return (Criteria) this;
        }

        public Criteria andIsRedPacketUsedNotLike(String value) {
            addCriterion("is_red_packet_used not like", value, "isRedPacketUsed");
            return (Criteria) this;
        }

        public Criteria andIsRedPacketUsedIn(List<String> values) {
            addCriterion("is_red_packet_used in", values, "isRedPacketUsed");
            return (Criteria) this;
        }

        public Criteria andIsRedPacketUsedNotIn(List<String> values) {
            addCriterion("is_red_packet_used not in", values, "isRedPacketUsed");
            return (Criteria) this;
        }

        public Criteria andIsRedPacketUsedBetween(String value1, String value2) {
            addCriterion("is_red_packet_used between", value1, value2, "isRedPacketUsed");
            return (Criteria) this;
        }

        public Criteria andIsRedPacketUsedNotBetween(String value1, String value2) {
            addCriterion("is_red_packet_used not between", value1, value2, "isRedPacketUsed");
            return (Criteria) this;
        }

        public Criteria andIsRemoteIsNull() {
            addCriterion("is_remote is null");
            return (Criteria) this;
        }

        public Criteria andIsRemoteIsNotNull() {
            addCriterion("is_remote is not null");
            return (Criteria) this;
        }

        public Criteria andIsRemoteEqualTo(String value) {
            addCriterion("is_remote =", value, "isRemote");
            return (Criteria) this;
        }

        public Criteria andIsRemoteNotEqualTo(String value) {
            addCriterion("is_remote <>", value, "isRemote");
            return (Criteria) this;
        }

        public Criteria andIsRemoteGreaterThan(String value) {
            addCriterion("is_remote >", value, "isRemote");
            return (Criteria) this;
        }

        public Criteria andIsRemoteGreaterThanOrEqualTo(String value) {
            addCriterion("is_remote >=", value, "isRemote");
            return (Criteria) this;
        }

        public Criteria andIsRemoteLessThan(String value) {
            addCriterion("is_remote <", value, "isRemote");
            return (Criteria) this;
        }

        public Criteria andIsRemoteLessThanOrEqualTo(String value) {
            addCriterion("is_remote <=", value, "isRemote");
            return (Criteria) this;
        }

        public Criteria andIsRemoteLike(String value) {
            addCriterion("is_remote like", value, "isRemote");
            return (Criteria) this;
        }

        public Criteria andIsRemoteNotLike(String value) {
            addCriterion("is_remote not like", value, "isRemote");
            return (Criteria) this;
        }

        public Criteria andIsRemoteIn(List<String> values) {
            addCriterion("is_remote in", values, "isRemote");
            return (Criteria) this;
        }

        public Criteria andIsRemoteNotIn(List<String> values) {
            addCriterion("is_remote not in", values, "isRemote");
            return (Criteria) this;
        }

        public Criteria andIsRemoteBetween(String value1, String value2) {
            addCriterion("is_remote between", value1, value2, "isRemote");
            return (Criteria) this;
        }

        public Criteria andIsRemoteNotBetween(String value1, String value2) {
            addCriterion("is_remote not between", value1, value2, "isRemote");
            return (Criteria) this;
        }

        public Criteria andOrderTagStrIsNull() {
            addCriterion("order_tag_str is null");
            return (Criteria) this;
        }

        public Criteria andOrderTagStrIsNotNull() {
            addCriterion("order_tag_str is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTagStrEqualTo(String value) {
            addCriterion("order_tag_str =", value, "orderTagStr");
            return (Criteria) this;
        }

        public Criteria andOrderTagStrNotEqualTo(String value) {
            addCriterion("order_tag_str <>", value, "orderTagStr");
            return (Criteria) this;
        }

        public Criteria andOrderTagStrGreaterThan(String value) {
            addCriterion("order_tag_str >", value, "orderTagStr");
            return (Criteria) this;
        }

        public Criteria andOrderTagStrGreaterThanOrEqualTo(String value) {
            addCriterion("order_tag_str >=", value, "orderTagStr");
            return (Criteria) this;
        }

        public Criteria andOrderTagStrLessThan(String value) {
            addCriterion("order_tag_str <", value, "orderTagStr");
            return (Criteria) this;
        }

        public Criteria andOrderTagStrLessThanOrEqualTo(String value) {
            addCriterion("order_tag_str <=", value, "orderTagStr");
            return (Criteria) this;
        }

        public Criteria andOrderTagStrLike(String value) {
            addCriterion("order_tag_str like", value, "orderTagStr");
            return (Criteria) this;
        }

        public Criteria andOrderTagStrNotLike(String value) {
            addCriterion("order_tag_str not like", value, "orderTagStr");
            return (Criteria) this;
        }

        public Criteria andOrderTagStrIn(List<String> values) {
            addCriterion("order_tag_str in", values, "orderTagStr");
            return (Criteria) this;
        }

        public Criteria andOrderTagStrNotIn(List<String> values) {
            addCriterion("order_tag_str not in", values, "orderTagStr");
            return (Criteria) this;
        }

        public Criteria andOrderTagStrBetween(String value1, String value2) {
            addCriterion("order_tag_str between", value1, value2, "orderTagStr");
            return (Criteria) this;
        }

        public Criteria andOrderTagStrNotBetween(String value1, String value2) {
            addCriterion("order_tag_str not between", value1, value2, "orderTagStr");
            return (Criteria) this;
        }

        public Criteria andInnerTagStrIsNull() {
            addCriterion("inner_tag_str is null");
            return (Criteria) this;
        }

        public Criteria andInnerTagStrIsNotNull() {
            addCriterion("inner_tag_str is not null");
            return (Criteria) this;
        }

        public Criteria andInnerTagStrEqualTo(String value) {
            addCriterion("inner_tag_str =", value, "innerTagStr");
            return (Criteria) this;
        }

        public Criteria andInnerTagStrNotEqualTo(String value) {
            addCriterion("inner_tag_str <>", value, "innerTagStr");
            return (Criteria) this;
        }

        public Criteria andInnerTagStrGreaterThan(String value) {
            addCriterion("inner_tag_str >", value, "innerTagStr");
            return (Criteria) this;
        }

        public Criteria andInnerTagStrGreaterThanOrEqualTo(String value) {
            addCriterion("inner_tag_str >=", value, "innerTagStr");
            return (Criteria) this;
        }

        public Criteria andInnerTagStrLessThan(String value) {
            addCriterion("inner_tag_str <", value, "innerTagStr");
            return (Criteria) this;
        }

        public Criteria andInnerTagStrLessThanOrEqualTo(String value) {
            addCriterion("inner_tag_str <=", value, "innerTagStr");
            return (Criteria) this;
        }

        public Criteria andInnerTagStrLike(String value) {
            addCriterion("inner_tag_str like", value, "innerTagStr");
            return (Criteria) this;
        }

        public Criteria andInnerTagStrNotLike(String value) {
            addCriterion("inner_tag_str not like", value, "innerTagStr");
            return (Criteria) this;
        }

        public Criteria andInnerTagStrIn(List<String> values) {
            addCriterion("inner_tag_str in", values, "innerTagStr");
            return (Criteria) this;
        }

        public Criteria andInnerTagStrNotIn(List<String> values) {
            addCriterion("inner_tag_str not in", values, "innerTagStr");
            return (Criteria) this;
        }

        public Criteria andInnerTagStrBetween(String value1, String value2) {
            addCriterion("inner_tag_str between", value1, value2, "innerTagStr");
            return (Criteria) this;
        }

        public Criteria andInnerTagStrNotBetween(String value1, String value2) {
            addCriterion("inner_tag_str not between", value1, value2, "innerTagStr");
            return (Criteria) this;
        }

        public Criteria andIsTeamOrderIsNull() {
            addCriterion("is_team_order is null");
            return (Criteria) this;
        }

        public Criteria andIsTeamOrderIsNotNull() {
            addCriterion("is_team_order is not null");
            return (Criteria) this;
        }

        public Criteria andIsTeamOrderEqualTo(String value) {
            addCriterion("is_team_order =", value, "isTeamOrder");
            return (Criteria) this;
        }

        public Criteria andIsTeamOrderNotEqualTo(String value) {
            addCriterion("is_team_order <>", value, "isTeamOrder");
            return (Criteria) this;
        }

        public Criteria andIsTeamOrderGreaterThan(String value) {
            addCriterion("is_team_order >", value, "isTeamOrder");
            return (Criteria) this;
        }

        public Criteria andIsTeamOrderGreaterThanOrEqualTo(String value) {
            addCriterion("is_team_order >=", value, "isTeamOrder");
            return (Criteria) this;
        }

        public Criteria andIsTeamOrderLessThan(String value) {
            addCriterion("is_team_order <", value, "isTeamOrder");
            return (Criteria) this;
        }

        public Criteria andIsTeamOrderLessThanOrEqualTo(String value) {
            addCriterion("is_team_order <=", value, "isTeamOrder");
            return (Criteria) this;
        }

        public Criteria andIsTeamOrderLike(String value) {
            addCriterion("is_team_order like", value, "isTeamOrder");
            return (Criteria) this;
        }

        public Criteria andIsTeamOrderNotLike(String value) {
            addCriterion("is_team_order not like", value, "isTeamOrder");
            return (Criteria) this;
        }

        public Criteria andIsTeamOrderIn(List<String> values) {
            addCriterion("is_team_order in", values, "isTeamOrder");
            return (Criteria) this;
        }

        public Criteria andIsTeamOrderNotIn(List<String> values) {
            addCriterion("is_team_order not in", values, "isTeamOrder");
            return (Criteria) this;
        }

        public Criteria andIsTeamOrderBetween(String value1, String value2) {
            addCriterion("is_team_order between", value1, value2, "isTeamOrder");
            return (Criteria) this;
        }

        public Criteria andIsTeamOrderNotBetween(String value1, String value2) {
            addCriterion("is_team_order not between", value1, value2, "isTeamOrder");
            return (Criteria) this;
        }

        public Criteria andIsTimeoutOrderIsNull() {
            addCriterion("is_timeout_order is null");
            return (Criteria) this;
        }

        public Criteria andIsTimeoutOrderIsNotNull() {
            addCriterion("is_timeout_order is not null");
            return (Criteria) this;
        }

        public Criteria andIsTimeoutOrderEqualTo(String value) {
            addCriterion("is_timeout_order =", value, "isTimeoutOrder");
            return (Criteria) this;
        }

        public Criteria andIsTimeoutOrderNotEqualTo(String value) {
            addCriterion("is_timeout_order <>", value, "isTimeoutOrder");
            return (Criteria) this;
        }

        public Criteria andIsTimeoutOrderGreaterThan(String value) {
            addCriterion("is_timeout_order >", value, "isTimeoutOrder");
            return (Criteria) this;
        }

        public Criteria andIsTimeoutOrderGreaterThanOrEqualTo(String value) {
            addCriterion("is_timeout_order >=", value, "isTimeoutOrder");
            return (Criteria) this;
        }

        public Criteria andIsTimeoutOrderLessThan(String value) {
            addCriterion("is_timeout_order <", value, "isTimeoutOrder");
            return (Criteria) this;
        }

        public Criteria andIsTimeoutOrderLessThanOrEqualTo(String value) {
            addCriterion("is_timeout_order <=", value, "isTimeoutOrder");
            return (Criteria) this;
        }

        public Criteria andIsTimeoutOrderLike(String value) {
            addCriterion("is_timeout_order like", value, "isTimeoutOrder");
            return (Criteria) this;
        }

        public Criteria andIsTimeoutOrderNotLike(String value) {
            addCriterion("is_timeout_order not like", value, "isTimeoutOrder");
            return (Criteria) this;
        }

        public Criteria andIsTimeoutOrderIn(List<String> values) {
            addCriterion("is_timeout_order in", values, "isTimeoutOrder");
            return (Criteria) this;
        }

        public Criteria andIsTimeoutOrderNotIn(List<String> values) {
            addCriterion("is_timeout_order not in", values, "isTimeoutOrder");
            return (Criteria) this;
        }

        public Criteria andIsTimeoutOrderBetween(String value1, String value2) {
            addCriterion("is_timeout_order between", value1, value2, "isTimeoutOrder");
            return (Criteria) this;
        }

        public Criteria andIsTimeoutOrderNotBetween(String value1, String value2) {
            addCriterion("is_timeout_order not between", value1, value2, "isTimeoutOrder");
            return (Criteria) this;
        }

        public Criteria andIsProblemOrderIsNull() {
            addCriterion("is_problem_order is null");
            return (Criteria) this;
        }

        public Criteria andIsProblemOrderIsNotNull() {
            addCriterion("is_problem_order is not null");
            return (Criteria) this;
        }

        public Criteria andIsProblemOrderEqualTo(String value) {
            addCriterion("is_problem_order =", value, "isProblemOrder");
            return (Criteria) this;
        }

        public Criteria andIsProblemOrderNotEqualTo(String value) {
            addCriterion("is_problem_order <>", value, "isProblemOrder");
            return (Criteria) this;
        }

        public Criteria andIsProblemOrderGreaterThan(String value) {
            addCriterion("is_problem_order >", value, "isProblemOrder");
            return (Criteria) this;
        }

        public Criteria andIsProblemOrderGreaterThanOrEqualTo(String value) {
            addCriterion("is_problem_order >=", value, "isProblemOrder");
            return (Criteria) this;
        }

        public Criteria andIsProblemOrderLessThan(String value) {
            addCriterion("is_problem_order <", value, "isProblemOrder");
            return (Criteria) this;
        }

        public Criteria andIsProblemOrderLessThanOrEqualTo(String value) {
            addCriterion("is_problem_order <=", value, "isProblemOrder");
            return (Criteria) this;
        }

        public Criteria andIsProblemOrderLike(String value) {
            addCriterion("is_problem_order like", value, "isProblemOrder");
            return (Criteria) this;
        }

        public Criteria andIsProblemOrderNotLike(String value) {
            addCriterion("is_problem_order not like", value, "isProblemOrder");
            return (Criteria) this;
        }

        public Criteria andIsProblemOrderIn(List<String> values) {
            addCriterion("is_problem_order in", values, "isProblemOrder");
            return (Criteria) this;
        }

        public Criteria andIsProblemOrderNotIn(List<String> values) {
            addCriterion("is_problem_order not in", values, "isProblemOrder");
            return (Criteria) this;
        }

        public Criteria andIsProblemOrderBetween(String value1, String value2) {
            addCriterion("is_problem_order between", value1, value2, "isProblemOrder");
            return (Criteria) this;
        }

        public Criteria andIsProblemOrderNotBetween(String value1, String value2) {
            addCriterion("is_problem_order not between", value1, value2, "isProblemOrder");
            return (Criteria) this;
        }

        public Criteria andIsComplaintsOrderIsNull() {
            addCriterion("is_complaints_order is null");
            return (Criteria) this;
        }

        public Criteria andIsComplaintsOrderIsNotNull() {
            addCriterion("is_complaints_order is not null");
            return (Criteria) this;
        }

        public Criteria andIsComplaintsOrderEqualTo(String value) {
            addCriterion("is_complaints_order =", value, "isComplaintsOrder");
            return (Criteria) this;
        }

        public Criteria andIsComplaintsOrderNotEqualTo(String value) {
            addCriterion("is_complaints_order <>", value, "isComplaintsOrder");
            return (Criteria) this;
        }

        public Criteria andIsComplaintsOrderGreaterThan(String value) {
            addCriterion("is_complaints_order >", value, "isComplaintsOrder");
            return (Criteria) this;
        }

        public Criteria andIsComplaintsOrderGreaterThanOrEqualTo(String value) {
            addCriterion("is_complaints_order >=", value, "isComplaintsOrder");
            return (Criteria) this;
        }

        public Criteria andIsComplaintsOrderLessThan(String value) {
            addCriterion("is_complaints_order <", value, "isComplaintsOrder");
            return (Criteria) this;
        }

        public Criteria andIsComplaintsOrderLessThanOrEqualTo(String value) {
            addCriterion("is_complaints_order <=", value, "isComplaintsOrder");
            return (Criteria) this;
        }

        public Criteria andIsComplaintsOrderLike(String value) {
            addCriterion("is_complaints_order like", value, "isComplaintsOrder");
            return (Criteria) this;
        }

        public Criteria andIsComplaintsOrderNotLike(String value) {
            addCriterion("is_complaints_order not like", value, "isComplaintsOrder");
            return (Criteria) this;
        }

        public Criteria andIsComplaintsOrderIn(List<String> values) {
            addCriterion("is_complaints_order in", values, "isComplaintsOrder");
            return (Criteria) this;
        }

        public Criteria andIsComplaintsOrderNotIn(List<String> values) {
            addCriterion("is_complaints_order not in", values, "isComplaintsOrder");
            return (Criteria) this;
        }

        public Criteria andIsComplaintsOrderBetween(String value1, String value2) {
            addCriterion("is_complaints_order between", value1, value2, "isComplaintsOrder");
            return (Criteria) this;
        }

        public Criteria andIsComplaintsOrderNotBetween(String value1, String value2) {
            addCriterion("is_complaints_order not between", value1, value2, "isComplaintsOrder");
            return (Criteria) this;
        }

        public Criteria andIsArtisanExtraChargeIsNull() {
            addCriterion("is_artisan_extra_charge is null");
            return (Criteria) this;
        }

        public Criteria andIsArtisanExtraChargeIsNotNull() {
            addCriterion("is_artisan_extra_charge is not null");
            return (Criteria) this;
        }

        public Criteria andIsArtisanExtraChargeEqualTo(String value) {
            addCriterion("is_artisan_extra_charge =", value, "isArtisanExtraCharge");
            return (Criteria) this;
        }

        public Criteria andIsArtisanExtraChargeNotEqualTo(String value) {
            addCriterion("is_artisan_extra_charge <>", value, "isArtisanExtraCharge");
            return (Criteria) this;
        }

        public Criteria andIsArtisanExtraChargeGreaterThan(String value) {
            addCriterion("is_artisan_extra_charge >", value, "isArtisanExtraCharge");
            return (Criteria) this;
        }

        public Criteria andIsArtisanExtraChargeGreaterThanOrEqualTo(String value) {
            addCriterion("is_artisan_extra_charge >=", value, "isArtisanExtraCharge");
            return (Criteria) this;
        }

        public Criteria andIsArtisanExtraChargeLessThan(String value) {
            addCriterion("is_artisan_extra_charge <", value, "isArtisanExtraCharge");
            return (Criteria) this;
        }

        public Criteria andIsArtisanExtraChargeLessThanOrEqualTo(String value) {
            addCriterion("is_artisan_extra_charge <=", value, "isArtisanExtraCharge");
            return (Criteria) this;
        }

        public Criteria andIsArtisanExtraChargeLike(String value) {
            addCriterion("is_artisan_extra_charge like", value, "isArtisanExtraCharge");
            return (Criteria) this;
        }

        public Criteria andIsArtisanExtraChargeNotLike(String value) {
            addCriterion("is_artisan_extra_charge not like", value, "isArtisanExtraCharge");
            return (Criteria) this;
        }

        public Criteria andIsArtisanExtraChargeIn(List<String> values) {
            addCriterion("is_artisan_extra_charge in", values, "isArtisanExtraCharge");
            return (Criteria) this;
        }

        public Criteria andIsArtisanExtraChargeNotIn(List<String> values) {
            addCriterion("is_artisan_extra_charge not in", values, "isArtisanExtraCharge");
            return (Criteria) this;
        }

        public Criteria andIsArtisanExtraChargeBetween(String value1, String value2) {
            addCriterion("is_artisan_extra_charge between", value1, value2, "isArtisanExtraCharge");
            return (Criteria) this;
        }

        public Criteria andIsArtisanExtraChargeNotBetween(String value1, String value2) {
            addCriterion("is_artisan_extra_charge not between", value1, value2, "isArtisanExtraCharge");
            return (Criteria) this;
        }

        public Criteria andIsPraiseAwardOrderIsNull() {
            addCriterion("is_praise_award_order is null");
            return (Criteria) this;
        }

        public Criteria andIsPraiseAwardOrderIsNotNull() {
            addCriterion("is_praise_award_order is not null");
            return (Criteria) this;
        }

        public Criteria andIsPraiseAwardOrderEqualTo(String value) {
            addCriterion("is_praise_award_order =", value, "isPraiseAwardOrder");
            return (Criteria) this;
        }

        public Criteria andIsPraiseAwardOrderNotEqualTo(String value) {
            addCriterion("is_praise_award_order <>", value, "isPraiseAwardOrder");
            return (Criteria) this;
        }

        public Criteria andIsPraiseAwardOrderGreaterThan(String value) {
            addCriterion("is_praise_award_order >", value, "isPraiseAwardOrder");
            return (Criteria) this;
        }

        public Criteria andIsPraiseAwardOrderGreaterThanOrEqualTo(String value) {
            addCriterion("is_praise_award_order >=", value, "isPraiseAwardOrder");
            return (Criteria) this;
        }

        public Criteria andIsPraiseAwardOrderLessThan(String value) {
            addCriterion("is_praise_award_order <", value, "isPraiseAwardOrder");
            return (Criteria) this;
        }

        public Criteria andIsPraiseAwardOrderLessThanOrEqualTo(String value) {
            addCriterion("is_praise_award_order <=", value, "isPraiseAwardOrder");
            return (Criteria) this;
        }

        public Criteria andIsPraiseAwardOrderLike(String value) {
            addCriterion("is_praise_award_order like", value, "isPraiseAwardOrder");
            return (Criteria) this;
        }

        public Criteria andIsPraiseAwardOrderNotLike(String value) {
            addCriterion("is_praise_award_order not like", value, "isPraiseAwardOrder");
            return (Criteria) this;
        }

        public Criteria andIsPraiseAwardOrderIn(List<String> values) {
            addCriterion("is_praise_award_order in", values, "isPraiseAwardOrder");
            return (Criteria) this;
        }

        public Criteria andIsPraiseAwardOrderNotIn(List<String> values) {
            addCriterion("is_praise_award_order not in", values, "isPraiseAwardOrder");
            return (Criteria) this;
        }

        public Criteria andIsPraiseAwardOrderBetween(String value1, String value2) {
            addCriterion("is_praise_award_order between", value1, value2, "isPraiseAwardOrder");
            return (Criteria) this;
        }

        public Criteria andIsPraiseAwardOrderNotBetween(String value1, String value2) {
            addCriterion("is_praise_award_order not between", value1, value2, "isPraiseAwardOrder");
            return (Criteria) this;
        }

        public Criteria andCustomerPraiseAwardAmountIsNull() {
            addCriterion("customer_praise_award_amount is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPraiseAwardAmountIsNotNull() {
            addCriterion("customer_praise_award_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPraiseAwardAmountEqualTo(BigDecimal value) {
            addCriterion("customer_praise_award_amount =", value, "customerPraiseAwardAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerPraiseAwardAmountNotEqualTo(BigDecimal value) {
            addCriterion("customer_praise_award_amount <>", value, "customerPraiseAwardAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerPraiseAwardAmountGreaterThan(BigDecimal value) {
            addCriterion("customer_praise_award_amount >", value, "customerPraiseAwardAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerPraiseAwardAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("customer_praise_award_amount >=", value, "customerPraiseAwardAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerPraiseAwardAmountLessThan(BigDecimal value) {
            addCriterion("customer_praise_award_amount <", value, "customerPraiseAwardAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerPraiseAwardAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("customer_praise_award_amount <=", value, "customerPraiseAwardAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerPraiseAwardAmountIn(List<BigDecimal> values) {
            addCriterion("customer_praise_award_amount in", values, "customerPraiseAwardAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerPraiseAwardAmountNotIn(List<BigDecimal> values) {
            addCriterion("customer_praise_award_amount not in", values, "customerPraiseAwardAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerPraiseAwardAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("customer_praise_award_amount between", value1, value2, "customerPraiseAwardAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerPraiseAwardAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("customer_praise_award_amount not between", value1, value2, "customerPraiseAwardAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanPraiseAwardAmountIsNull() {
            addCriterion("artisan_praise_award_amount is null");
            return (Criteria) this;
        }

        public Criteria andArtisanPraiseAwardAmountIsNotNull() {
            addCriterion("artisan_praise_award_amount is not null");
            return (Criteria) this;
        }

        public Criteria andArtisanPraiseAwardAmountEqualTo(BigDecimal value) {
            addCriterion("artisan_praise_award_amount =", value, "artisanPraiseAwardAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanPraiseAwardAmountNotEqualTo(BigDecimal value) {
            addCriterion("artisan_praise_award_amount <>", value, "artisanPraiseAwardAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanPraiseAwardAmountGreaterThan(BigDecimal value) {
            addCriterion("artisan_praise_award_amount >", value, "artisanPraiseAwardAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanPraiseAwardAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("artisan_praise_award_amount >=", value, "artisanPraiseAwardAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanPraiseAwardAmountLessThan(BigDecimal value) {
            addCriterion("artisan_praise_award_amount <", value, "artisanPraiseAwardAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanPraiseAwardAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("artisan_praise_award_amount <=", value, "artisanPraiseAwardAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanPraiseAwardAmountIn(List<BigDecimal> values) {
            addCriterion("artisan_praise_award_amount in", values, "artisanPraiseAwardAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanPraiseAwardAmountNotIn(List<BigDecimal> values) {
            addCriterion("artisan_praise_award_amount not in", values, "artisanPraiseAwardAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanPraiseAwardAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("artisan_praise_award_amount between", value1, value2, "artisanPraiseAwardAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanPraiseAwardAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("artisan_praise_award_amount not between", value1, value2, "artisanPraiseAwardAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerPraiseAwardAmountConfigIsNull() {
            addCriterion("customer_praise_award_amount_config is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPraiseAwardAmountConfigIsNotNull() {
            addCriterion("customer_praise_award_amount_config is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPraiseAwardAmountConfigEqualTo(BigDecimal value) {
            addCriterion("customer_praise_award_amount_config =", value, "customerPraiseAwardAmountConfig");
            return (Criteria) this;
        }

        public Criteria andCustomerPraiseAwardAmountConfigNotEqualTo(BigDecimal value) {
            addCriterion("customer_praise_award_amount_config <>", value, "customerPraiseAwardAmountConfig");
            return (Criteria) this;
        }

        public Criteria andCustomerPraiseAwardAmountConfigGreaterThan(BigDecimal value) {
            addCriterion("customer_praise_award_amount_config >", value, "customerPraiseAwardAmountConfig");
            return (Criteria) this;
        }

        public Criteria andCustomerPraiseAwardAmountConfigGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("customer_praise_award_amount_config >=", value, "customerPraiseAwardAmountConfig");
            return (Criteria) this;
        }

        public Criteria andCustomerPraiseAwardAmountConfigLessThan(BigDecimal value) {
            addCriterion("customer_praise_award_amount_config <", value, "customerPraiseAwardAmountConfig");
            return (Criteria) this;
        }

        public Criteria andCustomerPraiseAwardAmountConfigLessThanOrEqualTo(BigDecimal value) {
            addCriterion("customer_praise_award_amount_config <=", value, "customerPraiseAwardAmountConfig");
            return (Criteria) this;
        }

        public Criteria andCustomerPraiseAwardAmountConfigIn(List<BigDecimal> values) {
            addCriterion("customer_praise_award_amount_config in", values, "customerPraiseAwardAmountConfig");
            return (Criteria) this;
        }

        public Criteria andCustomerPraiseAwardAmountConfigNotIn(List<BigDecimal> values) {
            addCriterion("customer_praise_award_amount_config not in", values, "customerPraiseAwardAmountConfig");
            return (Criteria) this;
        }

        public Criteria andCustomerPraiseAwardAmountConfigBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("customer_praise_award_amount_config between", value1, value2, "customerPraiseAwardAmountConfig");
            return (Criteria) this;
        }

        public Criteria andCustomerPraiseAwardAmountConfigNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("customer_praise_award_amount_config not between", value1, value2, "customerPraiseAwardAmountConfig");
            return (Criteria) this;
        }

        public Criteria andArtisanPraiseAwardAmountConfigIsNull() {
            addCriterion("artisan_praise_award_amount_config is null");
            return (Criteria) this;
        }

        public Criteria andArtisanPraiseAwardAmountConfigIsNotNull() {
            addCriterion("artisan_praise_award_amount_config is not null");
            return (Criteria) this;
        }

        public Criteria andArtisanPraiseAwardAmountConfigEqualTo(BigDecimal value) {
            addCriterion("artisan_praise_award_amount_config =", value, "artisanPraiseAwardAmountConfig");
            return (Criteria) this;
        }

        public Criteria andArtisanPraiseAwardAmountConfigNotEqualTo(BigDecimal value) {
            addCriterion("artisan_praise_award_amount_config <>", value, "artisanPraiseAwardAmountConfig");
            return (Criteria) this;
        }

        public Criteria andArtisanPraiseAwardAmountConfigGreaterThan(BigDecimal value) {
            addCriterion("artisan_praise_award_amount_config >", value, "artisanPraiseAwardAmountConfig");
            return (Criteria) this;
        }

        public Criteria andArtisanPraiseAwardAmountConfigGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("artisan_praise_award_amount_config >=", value, "artisanPraiseAwardAmountConfig");
            return (Criteria) this;
        }

        public Criteria andArtisanPraiseAwardAmountConfigLessThan(BigDecimal value) {
            addCriterion("artisan_praise_award_amount_config <", value, "artisanPraiseAwardAmountConfig");
            return (Criteria) this;
        }

        public Criteria andArtisanPraiseAwardAmountConfigLessThanOrEqualTo(BigDecimal value) {
            addCriterion("artisan_praise_award_amount_config <=", value, "artisanPraiseAwardAmountConfig");
            return (Criteria) this;
        }

        public Criteria andArtisanPraiseAwardAmountConfigIn(List<BigDecimal> values) {
            addCriterion("artisan_praise_award_amount_config in", values, "artisanPraiseAwardAmountConfig");
            return (Criteria) this;
        }

        public Criteria andArtisanPraiseAwardAmountConfigNotIn(List<BigDecimal> values) {
            addCriterion("artisan_praise_award_amount_config not in", values, "artisanPraiseAwardAmountConfig");
            return (Criteria) this;
        }

        public Criteria andArtisanPraiseAwardAmountConfigBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("artisan_praise_award_amount_config between", value1, value2, "artisanPraiseAwardAmountConfig");
            return (Criteria) this;
        }

        public Criteria andArtisanPraiseAwardAmountConfigNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("artisan_praise_award_amount_config not between", value1, value2, "artisanPraiseAwardAmountConfig");
            return (Criteria) this;
        }

        public Criteria andIsExtendWarrantyOrderIsNull() {
            addCriterion("is_extend_warranty_order is null");
            return (Criteria) this;
        }

        public Criteria andIsExtendWarrantyOrderIsNotNull() {
            addCriterion("is_extend_warranty_order is not null");
            return (Criteria) this;
        }

        public Criteria andIsExtendWarrantyOrderEqualTo(String value) {
            addCriterion("is_extend_warranty_order =", value, "isExtendWarrantyOrder");
            return (Criteria) this;
        }

        public Criteria andIsExtendWarrantyOrderNotEqualTo(String value) {
            addCriterion("is_extend_warranty_order <>", value, "isExtendWarrantyOrder");
            return (Criteria) this;
        }

        public Criteria andIsExtendWarrantyOrderGreaterThan(String value) {
            addCriterion("is_extend_warranty_order >", value, "isExtendWarrantyOrder");
            return (Criteria) this;
        }

        public Criteria andIsExtendWarrantyOrderGreaterThanOrEqualTo(String value) {
            addCriterion("is_extend_warranty_order >=", value, "isExtendWarrantyOrder");
            return (Criteria) this;
        }

        public Criteria andIsExtendWarrantyOrderLessThan(String value) {
            addCriterion("is_extend_warranty_order <", value, "isExtendWarrantyOrder");
            return (Criteria) this;
        }

        public Criteria andIsExtendWarrantyOrderLessThanOrEqualTo(String value) {
            addCriterion("is_extend_warranty_order <=", value, "isExtendWarrantyOrder");
            return (Criteria) this;
        }

        public Criteria andIsExtendWarrantyOrderLike(String value) {
            addCriterion("is_extend_warranty_order like", value, "isExtendWarrantyOrder");
            return (Criteria) this;
        }

        public Criteria andIsExtendWarrantyOrderNotLike(String value) {
            addCriterion("is_extend_warranty_order not like", value, "isExtendWarrantyOrder");
            return (Criteria) this;
        }

        public Criteria andIsExtendWarrantyOrderIn(List<String> values) {
            addCriterion("is_extend_warranty_order in", values, "isExtendWarrantyOrder");
            return (Criteria) this;
        }

        public Criteria andIsExtendWarrantyOrderNotIn(List<String> values) {
            addCriterion("is_extend_warranty_order not in", values, "isExtendWarrantyOrder");
            return (Criteria) this;
        }

        public Criteria andIsExtendWarrantyOrderBetween(String value1, String value2) {
            addCriterion("is_extend_warranty_order between", value1, value2, "isExtendWarrantyOrder");
            return (Criteria) this;
        }

        public Criteria andIsExtendWarrantyOrderNotBetween(String value1, String value2) {
            addCriterion("is_extend_warranty_order not between", value1, value2, "isExtendWarrantyOrder");
            return (Criteria) this;
        }

        public Criteria andArtisanRecommendAwardAmountIsNull() {
            addCriterion("artisan_recommend_award_amount is null");
            return (Criteria) this;
        }

        public Criteria andArtisanRecommendAwardAmountIsNotNull() {
            addCriterion("artisan_recommend_award_amount is not null");
            return (Criteria) this;
        }

        public Criteria andArtisanRecommendAwardAmountEqualTo(BigDecimal value) {
            addCriterion("artisan_recommend_award_amount =", value, "artisanRecommendAwardAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanRecommendAwardAmountNotEqualTo(BigDecimal value) {
            addCriterion("artisan_recommend_award_amount <>", value, "artisanRecommendAwardAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanRecommendAwardAmountGreaterThan(BigDecimal value) {
            addCriterion("artisan_recommend_award_amount >", value, "artisanRecommendAwardAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanRecommendAwardAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("artisan_recommend_award_amount >=", value, "artisanRecommendAwardAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanRecommendAwardAmountLessThan(BigDecimal value) {
            addCriterion("artisan_recommend_award_amount <", value, "artisanRecommendAwardAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanRecommendAwardAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("artisan_recommend_award_amount <=", value, "artisanRecommendAwardAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanRecommendAwardAmountIn(List<BigDecimal> values) {
            addCriterion("artisan_recommend_award_amount in", values, "artisanRecommendAwardAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanRecommendAwardAmountNotIn(List<BigDecimal> values) {
            addCriterion("artisan_recommend_award_amount not in", values, "artisanRecommendAwardAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanRecommendAwardAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("artisan_recommend_award_amount between", value1, value2, "artisanRecommendAwardAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanRecommendAwardAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("artisan_recommend_award_amount not between", value1, value2, "artisanRecommendAwardAmount");
            return (Criteria) this;
        }

        public Criteria andArtisanRecommendAwardAmountConfigIsNull() {
            addCriterion("artisan_recommend_award_amount_config is null");
            return (Criteria) this;
        }

        public Criteria andArtisanRecommendAwardAmountConfigIsNotNull() {
            addCriterion("artisan_recommend_award_amount_config is not null");
            return (Criteria) this;
        }

        public Criteria andArtisanRecommendAwardAmountConfigEqualTo(BigDecimal value) {
            addCriterion("artisan_recommend_award_amount_config =", value, "artisanRecommendAwardAmountConfig");
            return (Criteria) this;
        }

        public Criteria andArtisanRecommendAwardAmountConfigNotEqualTo(BigDecimal value) {
            addCriterion("artisan_recommend_award_amount_config <>", value, "artisanRecommendAwardAmountConfig");
            return (Criteria) this;
        }

        public Criteria andArtisanRecommendAwardAmountConfigGreaterThan(BigDecimal value) {
            addCriterion("artisan_recommend_award_amount_config >", value, "artisanRecommendAwardAmountConfig");
            return (Criteria) this;
        }

        public Criteria andArtisanRecommendAwardAmountConfigGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("artisan_recommend_award_amount_config >=", value, "artisanRecommendAwardAmountConfig");
            return (Criteria) this;
        }

        public Criteria andArtisanRecommendAwardAmountConfigLessThan(BigDecimal value) {
            addCriterion("artisan_recommend_award_amount_config <", value, "artisanRecommendAwardAmountConfig");
            return (Criteria) this;
        }

        public Criteria andArtisanRecommendAwardAmountConfigLessThanOrEqualTo(BigDecimal value) {
            addCriterion("artisan_recommend_award_amount_config <=", value, "artisanRecommendAwardAmountConfig");
            return (Criteria) this;
        }

        public Criteria andArtisanRecommendAwardAmountConfigIn(List<BigDecimal> values) {
            addCriterion("artisan_recommend_award_amount_config in", values, "artisanRecommendAwardAmountConfig");
            return (Criteria) this;
        }

        public Criteria andArtisanRecommendAwardAmountConfigNotIn(List<BigDecimal> values) {
            addCriterion("artisan_recommend_award_amount_config not in", values, "artisanRecommendAwardAmountConfig");
            return (Criteria) this;
        }

        public Criteria andArtisanRecommendAwardAmountConfigBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("artisan_recommend_award_amount_config between", value1, value2, "artisanRecommendAwardAmountConfig");
            return (Criteria) this;
        }

        public Criteria andArtisanRecommendAwardAmountConfigNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("artisan_recommend_award_amount_config not between", value1, value2, "artisanRecommendAwardAmountConfig");
            return (Criteria) this;
        }

        public Criteria andExtendWarrantyIsPaidIsNull() {
            addCriterion("extend_warranty_is_paid is null");
            return (Criteria) this;
        }

        public Criteria andExtendWarrantyIsPaidIsNotNull() {
            addCriterion("extend_warranty_is_paid is not null");
            return (Criteria) this;
        }

        public Criteria andExtendWarrantyIsPaidEqualTo(String value) {
            addCriterion("extend_warranty_is_paid =", value, "extendWarrantyIsPaid");
            return (Criteria) this;
        }

        public Criteria andExtendWarrantyIsPaidNotEqualTo(String value) {
            addCriterion("extend_warranty_is_paid <>", value, "extendWarrantyIsPaid");
            return (Criteria) this;
        }

        public Criteria andExtendWarrantyIsPaidGreaterThan(String value) {
            addCriterion("extend_warranty_is_paid >", value, "extendWarrantyIsPaid");
            return (Criteria) this;
        }

        public Criteria andExtendWarrantyIsPaidGreaterThanOrEqualTo(String value) {
            addCriterion("extend_warranty_is_paid >=", value, "extendWarrantyIsPaid");
            return (Criteria) this;
        }

        public Criteria andExtendWarrantyIsPaidLessThan(String value) {
            addCriterion("extend_warranty_is_paid <", value, "extendWarrantyIsPaid");
            return (Criteria) this;
        }

        public Criteria andExtendWarrantyIsPaidLessThanOrEqualTo(String value) {
            addCriterion("extend_warranty_is_paid <=", value, "extendWarrantyIsPaid");
            return (Criteria) this;
        }

        public Criteria andExtendWarrantyIsPaidLike(String value) {
            addCriterion("extend_warranty_is_paid like", value, "extendWarrantyIsPaid");
            return (Criteria) this;
        }

        public Criteria andExtendWarrantyIsPaidNotLike(String value) {
            addCriterion("extend_warranty_is_paid not like", value, "extendWarrantyIsPaid");
            return (Criteria) this;
        }

        public Criteria andExtendWarrantyIsPaidIn(List<String> values) {
            addCriterion("extend_warranty_is_paid in", values, "extendWarrantyIsPaid");
            return (Criteria) this;
        }

        public Criteria andExtendWarrantyIsPaidNotIn(List<String> values) {
            addCriterion("extend_warranty_is_paid not in", values, "extendWarrantyIsPaid");
            return (Criteria) this;
        }

        public Criteria andExtendWarrantyIsPaidBetween(String value1, String value2) {
            addCriterion("extend_warranty_is_paid between", value1, value2, "extendWarrantyIsPaid");
            return (Criteria) this;
        }

        public Criteria andExtendWarrantyIsPaidNotBetween(String value1, String value2) {
            addCriterion("extend_warranty_is_paid not between", value1, value2, "extendWarrantyIsPaid");
            return (Criteria) this;
        }

        public Criteria andTwoDaysExtendWarrantyPushIsNull() {
            addCriterion("two_days_extend_warranty_push is null");
            return (Criteria) this;
        }

        public Criteria andTwoDaysExtendWarrantyPushIsNotNull() {
            addCriterion("two_days_extend_warranty_push is not null");
            return (Criteria) this;
        }

        public Criteria andTwoDaysExtendWarrantyPushEqualTo(String value) {
            addCriterion("two_days_extend_warranty_push =", value, "twoDaysExtendWarrantyPush");
            return (Criteria) this;
        }

        public Criteria andTwoDaysExtendWarrantyPushNotEqualTo(String value) {
            addCriterion("two_days_extend_warranty_push <>", value, "twoDaysExtendWarrantyPush");
            return (Criteria) this;
        }

        public Criteria andTwoDaysExtendWarrantyPushGreaterThan(String value) {
            addCriterion("two_days_extend_warranty_push >", value, "twoDaysExtendWarrantyPush");
            return (Criteria) this;
        }

        public Criteria andTwoDaysExtendWarrantyPushGreaterThanOrEqualTo(String value) {
            addCriterion("two_days_extend_warranty_push >=", value, "twoDaysExtendWarrantyPush");
            return (Criteria) this;
        }

        public Criteria andTwoDaysExtendWarrantyPushLessThan(String value) {
            addCriterion("two_days_extend_warranty_push <", value, "twoDaysExtendWarrantyPush");
            return (Criteria) this;
        }

        public Criteria andTwoDaysExtendWarrantyPushLessThanOrEqualTo(String value) {
            addCriterion("two_days_extend_warranty_push <=", value, "twoDaysExtendWarrantyPush");
            return (Criteria) this;
        }

        public Criteria andTwoDaysExtendWarrantyPushLike(String value) {
            addCriterion("two_days_extend_warranty_push like", value, "twoDaysExtendWarrantyPush");
            return (Criteria) this;
        }

        public Criteria andTwoDaysExtendWarrantyPushNotLike(String value) {
            addCriterion("two_days_extend_warranty_push not like", value, "twoDaysExtendWarrantyPush");
            return (Criteria) this;
        }

        public Criteria andTwoDaysExtendWarrantyPushIn(List<String> values) {
            addCriterion("two_days_extend_warranty_push in", values, "twoDaysExtendWarrantyPush");
            return (Criteria) this;
        }

        public Criteria andTwoDaysExtendWarrantyPushNotIn(List<String> values) {
            addCriterion("two_days_extend_warranty_push not in", values, "twoDaysExtendWarrantyPush");
            return (Criteria) this;
        }

        public Criteria andTwoDaysExtendWarrantyPushBetween(String value1, String value2) {
            addCriterion("two_days_extend_warranty_push between", value1, value2, "twoDaysExtendWarrantyPush");
            return (Criteria) this;
        }

        public Criteria andTwoDaysExtendWarrantyPushNotBetween(String value1, String value2) {
            addCriterion("two_days_extend_warranty_push not between", value1, value2, "twoDaysExtendWarrantyPush");
            return (Criteria) this;
        }

        public Criteria andTwoDaysExtendWarrantyPushTimeIsNull() {
            addCriterion("two_days_extend_warranty_push_time is null");
            return (Criteria) this;
        }

        public Criteria andTwoDaysExtendWarrantyPushTimeIsNotNull() {
            addCriterion("two_days_extend_warranty_push_time is not null");
            return (Criteria) this;
        }

        public Criteria andTwoDaysExtendWarrantyPushTimeEqualTo(Date value) {
            addCriterion("two_days_extend_warranty_push_time =", value, "twoDaysExtendWarrantyPushTime");
            return (Criteria) this;
        }

        public Criteria andTwoDaysExtendWarrantyPushTimeNotEqualTo(Date value) {
            addCriterion("two_days_extend_warranty_push_time <>", value, "twoDaysExtendWarrantyPushTime");
            return (Criteria) this;
        }

        public Criteria andTwoDaysExtendWarrantyPushTimeGreaterThan(Date value) {
            addCriterion("two_days_extend_warranty_push_time >", value, "twoDaysExtendWarrantyPushTime");
            return (Criteria) this;
        }

        public Criteria andTwoDaysExtendWarrantyPushTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("two_days_extend_warranty_push_time >=", value, "twoDaysExtendWarrantyPushTime");
            return (Criteria) this;
        }

        public Criteria andTwoDaysExtendWarrantyPushTimeLessThan(Date value) {
            addCriterion("two_days_extend_warranty_push_time <", value, "twoDaysExtendWarrantyPushTime");
            return (Criteria) this;
        }

        public Criteria andTwoDaysExtendWarrantyPushTimeLessThanOrEqualTo(Date value) {
            addCriterion("two_days_extend_warranty_push_time <=", value, "twoDaysExtendWarrantyPushTime");
            return (Criteria) this;
        }

        public Criteria andTwoDaysExtendWarrantyPushTimeIn(List<Date> values) {
            addCriterion("two_days_extend_warranty_push_time in", values, "twoDaysExtendWarrantyPushTime");
            return (Criteria) this;
        }

        public Criteria andTwoDaysExtendWarrantyPushTimeNotIn(List<Date> values) {
            addCriterion("two_days_extend_warranty_push_time not in", values, "twoDaysExtendWarrantyPushTime");
            return (Criteria) this;
        }

        public Criteria andTwoDaysExtendWarrantyPushTimeBetween(Date value1, Date value2) {
            addCriterion("two_days_extend_warranty_push_time between", value1, value2, "twoDaysExtendWarrantyPushTime");
            return (Criteria) this;
        }

        public Criteria andTwoDaysExtendWarrantyPushTimeNotBetween(Date value1, Date value2) {
            addCriterion("two_days_extend_warranty_push_time not between", value1, value2, "twoDaysExtendWarrantyPushTime");
            return (Criteria) this;
        }

        public Criteria andSparePartsClearingTypeCodeIsNull() {
            addCriterion("spare_parts_clearing_type_code is null");
            return (Criteria) this;
        }

        public Criteria andSparePartsClearingTypeCodeIsNotNull() {
            addCriterion("spare_parts_clearing_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andSparePartsClearingTypeCodeEqualTo(String value) {
            addCriterion("spare_parts_clearing_type_code =", value, "sparePartsClearingTypeCode");
            return (Criteria) this;
        }

        public Criteria andSparePartsClearingTypeCodeNotEqualTo(String value) {
            addCriterion("spare_parts_clearing_type_code <>", value, "sparePartsClearingTypeCode");
            return (Criteria) this;
        }

        public Criteria andSparePartsClearingTypeCodeGreaterThan(String value) {
            addCriterion("spare_parts_clearing_type_code >", value, "sparePartsClearingTypeCode");
            return (Criteria) this;
        }

        public Criteria andSparePartsClearingTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("spare_parts_clearing_type_code >=", value, "sparePartsClearingTypeCode");
            return (Criteria) this;
        }

        public Criteria andSparePartsClearingTypeCodeLessThan(String value) {
            addCriterion("spare_parts_clearing_type_code <", value, "sparePartsClearingTypeCode");
            return (Criteria) this;
        }

        public Criteria andSparePartsClearingTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("spare_parts_clearing_type_code <=", value, "sparePartsClearingTypeCode");
            return (Criteria) this;
        }

        public Criteria andSparePartsClearingTypeCodeLike(String value) {
            addCriterion("spare_parts_clearing_type_code like", value, "sparePartsClearingTypeCode");
            return (Criteria) this;
        }

        public Criteria andSparePartsClearingTypeCodeNotLike(String value) {
            addCriterion("spare_parts_clearing_type_code not like", value, "sparePartsClearingTypeCode");
            return (Criteria) this;
        }

        public Criteria andSparePartsClearingTypeCodeIn(List<String> values) {
            addCriterion("spare_parts_clearing_type_code in", values, "sparePartsClearingTypeCode");
            return (Criteria) this;
        }

        public Criteria andSparePartsClearingTypeCodeNotIn(List<String> values) {
            addCriterion("spare_parts_clearing_type_code not in", values, "sparePartsClearingTypeCode");
            return (Criteria) this;
        }

        public Criteria andSparePartsClearingTypeCodeBetween(String value1, String value2) {
            addCriterion("spare_parts_clearing_type_code between", value1, value2, "sparePartsClearingTypeCode");
            return (Criteria) this;
        }

        public Criteria andSparePartsClearingTypeCodeNotBetween(String value1, String value2) {
            addCriterion("spare_parts_clearing_type_code not between", value1, value2, "sparePartsClearingTypeCode");
            return (Criteria) this;
        }

        public Criteria andUnconfirmedServingTimeIsNull() {
            addCriterion("unconfirmed_serving_time is null");
            return (Criteria) this;
        }

        public Criteria andUnconfirmedServingTimeIsNotNull() {
            addCriterion("unconfirmed_serving_time is not null");
            return (Criteria) this;
        }

        public Criteria andUnconfirmedServingTimeEqualTo(String value) {
            addCriterion("unconfirmed_serving_time =", value, "unconfirmedServingTime");
            return (Criteria) this;
        }

        public Criteria andUnconfirmedServingTimeNotEqualTo(String value) {
            addCriterion("unconfirmed_serving_time <>", value, "unconfirmedServingTime");
            return (Criteria) this;
        }

        public Criteria andUnconfirmedServingTimeGreaterThan(String value) {
            addCriterion("unconfirmed_serving_time >", value, "unconfirmedServingTime");
            return (Criteria) this;
        }

        public Criteria andUnconfirmedServingTimeGreaterThanOrEqualTo(String value) {
            addCriterion("unconfirmed_serving_time >=", value, "unconfirmedServingTime");
            return (Criteria) this;
        }

        public Criteria andUnconfirmedServingTimeLessThan(String value) {
            addCriterion("unconfirmed_serving_time <", value, "unconfirmedServingTime");
            return (Criteria) this;
        }

        public Criteria andUnconfirmedServingTimeLessThanOrEqualTo(String value) {
            addCriterion("unconfirmed_serving_time <=", value, "unconfirmedServingTime");
            return (Criteria) this;
        }

        public Criteria andUnconfirmedServingTimeLike(String value) {
            addCriterion("unconfirmed_serving_time like", value, "unconfirmedServingTime");
            return (Criteria) this;
        }

        public Criteria andUnconfirmedServingTimeNotLike(String value) {
            addCriterion("unconfirmed_serving_time not like", value, "unconfirmedServingTime");
            return (Criteria) this;
        }

        public Criteria andUnconfirmedServingTimeIn(List<String> values) {
            addCriterion("unconfirmed_serving_time in", values, "unconfirmedServingTime");
            return (Criteria) this;
        }

        public Criteria andUnconfirmedServingTimeNotIn(List<String> values) {
            addCriterion("unconfirmed_serving_time not in", values, "unconfirmedServingTime");
            return (Criteria) this;
        }

        public Criteria andUnconfirmedServingTimeBetween(String value1, String value2) {
            addCriterion("unconfirmed_serving_time between", value1, value2, "unconfirmedServingTime");
            return (Criteria) this;
        }

        public Criteria andUnconfirmedServingTimeNotBetween(String value1, String value2) {
            addCriterion("unconfirmed_serving_time not between", value1, value2, "unconfirmedServingTime");
            return (Criteria) this;
        }

        public Criteria andIsProductReceivingIsNull() {
            addCriterion("is_product_receiving is null");
            return (Criteria) this;
        }

        public Criteria andIsProductReceivingIsNotNull() {
            addCriterion("is_product_receiving is not null");
            return (Criteria) this;
        }

        public Criteria andIsProductReceivingEqualTo(String value) {
            addCriterion("is_product_receiving =", value, "isProductReceiving");
            return (Criteria) this;
        }

        public Criteria andIsProductReceivingNotEqualTo(String value) {
            addCriterion("is_product_receiving <>", value, "isProductReceiving");
            return (Criteria) this;
        }

        public Criteria andIsProductReceivingGreaterThan(String value) {
            addCriterion("is_product_receiving >", value, "isProductReceiving");
            return (Criteria) this;
        }

        public Criteria andIsProductReceivingGreaterThanOrEqualTo(String value) {
            addCriterion("is_product_receiving >=", value, "isProductReceiving");
            return (Criteria) this;
        }

        public Criteria andIsProductReceivingLessThan(String value) {
            addCriterion("is_product_receiving <", value, "isProductReceiving");
            return (Criteria) this;
        }

        public Criteria andIsProductReceivingLessThanOrEqualTo(String value) {
            addCriterion("is_product_receiving <=", value, "isProductReceiving");
            return (Criteria) this;
        }

        public Criteria andIsProductReceivingLike(String value) {
            addCriterion("is_product_receiving like", value, "isProductReceiving");
            return (Criteria) this;
        }

        public Criteria andIsProductReceivingNotLike(String value) {
            addCriterion("is_product_receiving not like", value, "isProductReceiving");
            return (Criteria) this;
        }

        public Criteria andIsProductReceivingIn(List<String> values) {
            addCriterion("is_product_receiving in", values, "isProductReceiving");
            return (Criteria) this;
        }

        public Criteria andIsProductReceivingNotIn(List<String> values) {
            addCriterion("is_product_receiving not in", values, "isProductReceiving");
            return (Criteria) this;
        }

        public Criteria andIsProductReceivingBetween(String value1, String value2) {
            addCriterion("is_product_receiving between", value1, value2, "isProductReceiving");
            return (Criteria) this;
        }

        public Criteria andIsProductReceivingNotBetween(String value1, String value2) {
            addCriterion("is_product_receiving not between", value1, value2, "isProductReceiving");
            return (Criteria) this;
        }

        public Criteria andIsSystemSingProductReceivingIsNull() {
            addCriterion("is_system_sing_product_receiving is null");
            return (Criteria) this;
        }

        public Criteria andIsSystemSingProductReceivingIsNotNull() {
            addCriterion("is_system_sing_product_receiving is not null");
            return (Criteria) this;
        }

        public Criteria andIsSystemSingProductReceivingEqualTo(String value) {
            addCriterion("is_system_sing_product_receiving =", value, "isSystemSingProductReceiving");
            return (Criteria) this;
        }

        public Criteria andIsSystemSingProductReceivingNotEqualTo(String value) {
            addCriterion("is_system_sing_product_receiving <>", value, "isSystemSingProductReceiving");
            return (Criteria) this;
        }

        public Criteria andIsSystemSingProductReceivingGreaterThan(String value) {
            addCriterion("is_system_sing_product_receiving >", value, "isSystemSingProductReceiving");
            return (Criteria) this;
        }

        public Criteria andIsSystemSingProductReceivingGreaterThanOrEqualTo(String value) {
            addCriterion("is_system_sing_product_receiving >=", value, "isSystemSingProductReceiving");
            return (Criteria) this;
        }

        public Criteria andIsSystemSingProductReceivingLessThan(String value) {
            addCriterion("is_system_sing_product_receiving <", value, "isSystemSingProductReceiving");
            return (Criteria) this;
        }

        public Criteria andIsSystemSingProductReceivingLessThanOrEqualTo(String value) {
            addCriterion("is_system_sing_product_receiving <=", value, "isSystemSingProductReceiving");
            return (Criteria) this;
        }

        public Criteria andIsSystemSingProductReceivingLike(String value) {
            addCriterion("is_system_sing_product_receiving like", value, "isSystemSingProductReceiving");
            return (Criteria) this;
        }

        public Criteria andIsSystemSingProductReceivingNotLike(String value) {
            addCriterion("is_system_sing_product_receiving not like", value, "isSystemSingProductReceiving");
            return (Criteria) this;
        }

        public Criteria andIsSystemSingProductReceivingIn(List<String> values) {
            addCriterion("is_system_sing_product_receiving in", values, "isSystemSingProductReceiving");
            return (Criteria) this;
        }

        public Criteria andIsSystemSingProductReceivingNotIn(List<String> values) {
            addCriterion("is_system_sing_product_receiving not in", values, "isSystemSingProductReceiving");
            return (Criteria) this;
        }

        public Criteria andIsSystemSingProductReceivingBetween(String value1, String value2) {
            addCriterion("is_system_sing_product_receiving between", value1, value2, "isSystemSingProductReceiving");
            return (Criteria) this;
        }

        public Criteria andIsSystemSingProductReceivingNotBetween(String value1, String value2) {
            addCriterion("is_system_sing_product_receiving not between", value1, value2, "isSystemSingProductReceiving");
            return (Criteria) this;
        }

        public Criteria andIsNeedServingIsNull() {
            addCriterion("is_need_serving is null");
            return (Criteria) this;
        }

        public Criteria andIsNeedServingIsNotNull() {
            addCriterion("is_need_serving is not null");
            return (Criteria) this;
        }

        public Criteria andIsNeedServingEqualTo(String value) {
            addCriterion("is_need_serving =", value, "isNeedServing");
            return (Criteria) this;
        }

        public Criteria andIsNeedServingNotEqualTo(String value) {
            addCriterion("is_need_serving <>", value, "isNeedServing");
            return (Criteria) this;
        }

        public Criteria andIsNeedServingGreaterThan(String value) {
            addCriterion("is_need_serving >", value, "isNeedServing");
            return (Criteria) this;
        }

        public Criteria andIsNeedServingGreaterThanOrEqualTo(String value) {
            addCriterion("is_need_serving >=", value, "isNeedServing");
            return (Criteria) this;
        }

        public Criteria andIsNeedServingLessThan(String value) {
            addCriterion("is_need_serving <", value, "isNeedServing");
            return (Criteria) this;
        }

        public Criteria andIsNeedServingLessThanOrEqualTo(String value) {
            addCriterion("is_need_serving <=", value, "isNeedServing");
            return (Criteria) this;
        }

        public Criteria andIsNeedServingLike(String value) {
            addCriterion("is_need_serving like", value, "isNeedServing");
            return (Criteria) this;
        }

        public Criteria andIsNeedServingNotLike(String value) {
            addCriterion("is_need_serving not like", value, "isNeedServing");
            return (Criteria) this;
        }

        public Criteria andIsNeedServingIn(List<String> values) {
            addCriterion("is_need_serving in", values, "isNeedServing");
            return (Criteria) this;
        }

        public Criteria andIsNeedServingNotIn(List<String> values) {
            addCriterion("is_need_serving not in", values, "isNeedServing");
            return (Criteria) this;
        }

        public Criteria andIsNeedServingBetween(String value1, String value2) {
            addCriterion("is_need_serving between", value1, value2, "isNeedServing");
            return (Criteria) this;
        }

        public Criteria andIsNeedServingNotBetween(String value1, String value2) {
            addCriterion("is_need_serving not between", value1, value2, "isNeedServing");
            return (Criteria) this;
        }

        public Criteria andSendOrderSmsSignIsNull() {
            addCriterion("send_order_sms_sign is null");
            return (Criteria) this;
        }

        public Criteria andSendOrderSmsSignIsNotNull() {
            addCriterion("send_order_sms_sign is not null");
            return (Criteria) this;
        }

        public Criteria andSendOrderSmsSignEqualTo(String value) {
            addCriterion("send_order_sms_sign =", value, "sendOrderSmsSign");
            return (Criteria) this;
        }

        public Criteria andSendOrderSmsSignNotEqualTo(String value) {
            addCriterion("send_order_sms_sign <>", value, "sendOrderSmsSign");
            return (Criteria) this;
        }

        public Criteria andSendOrderSmsSignGreaterThan(String value) {
            addCriterion("send_order_sms_sign >", value, "sendOrderSmsSign");
            return (Criteria) this;
        }

        public Criteria andSendOrderSmsSignGreaterThanOrEqualTo(String value) {
            addCriterion("send_order_sms_sign >=", value, "sendOrderSmsSign");
            return (Criteria) this;
        }

        public Criteria andSendOrderSmsSignLessThan(String value) {
            addCriterion("send_order_sms_sign <", value, "sendOrderSmsSign");
            return (Criteria) this;
        }

        public Criteria andSendOrderSmsSignLessThanOrEqualTo(String value) {
            addCriterion("send_order_sms_sign <=", value, "sendOrderSmsSign");
            return (Criteria) this;
        }

        public Criteria andSendOrderSmsSignLike(String value) {
            addCriterion("send_order_sms_sign like", value, "sendOrderSmsSign");
            return (Criteria) this;
        }

        public Criteria andSendOrderSmsSignNotLike(String value) {
            addCriterion("send_order_sms_sign not like", value, "sendOrderSmsSign");
            return (Criteria) this;
        }

        public Criteria andSendOrderSmsSignIn(List<String> values) {
            addCriterion("send_order_sms_sign in", values, "sendOrderSmsSign");
            return (Criteria) this;
        }

        public Criteria andSendOrderSmsSignNotIn(List<String> values) {
            addCriterion("send_order_sms_sign not in", values, "sendOrderSmsSign");
            return (Criteria) this;
        }

        public Criteria andSendOrderSmsSignBetween(String value1, String value2) {
            addCriterion("send_order_sms_sign between", value1, value2, "sendOrderSmsSign");
            return (Criteria) this;
        }

        public Criteria andSendOrderSmsSignNotBetween(String value1, String value2) {
            addCriterion("send_order_sms_sign not between", value1, value2, "sendOrderSmsSign");
            return (Criteria) this;
        }

        public Criteria andIsCheckSignPhotoIsNull() {
            addCriterion("is_check_sign_photo is null");
            return (Criteria) this;
        }

        public Criteria andIsCheckSignPhotoIsNotNull() {
            addCriterion("is_check_sign_photo is not null");
            return (Criteria) this;
        }

        public Criteria andIsCheckSignPhotoEqualTo(String value) {
            addCriterion("is_check_sign_photo =", value, "isCheckSignPhoto");
            return (Criteria) this;
        }

        public Criteria andIsCheckSignPhotoNotEqualTo(String value) {
            addCriterion("is_check_sign_photo <>", value, "isCheckSignPhoto");
            return (Criteria) this;
        }

        public Criteria andIsCheckSignPhotoGreaterThan(String value) {
            addCriterion("is_check_sign_photo >", value, "isCheckSignPhoto");
            return (Criteria) this;
        }

        public Criteria andIsCheckSignPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("is_check_sign_photo >=", value, "isCheckSignPhoto");
            return (Criteria) this;
        }

        public Criteria andIsCheckSignPhotoLessThan(String value) {
            addCriterion("is_check_sign_photo <", value, "isCheckSignPhoto");
            return (Criteria) this;
        }

        public Criteria andIsCheckSignPhotoLessThanOrEqualTo(String value) {
            addCriterion("is_check_sign_photo <=", value, "isCheckSignPhoto");
            return (Criteria) this;
        }

        public Criteria andIsCheckSignPhotoLike(String value) {
            addCriterion("is_check_sign_photo like", value, "isCheckSignPhoto");
            return (Criteria) this;
        }

        public Criteria andIsCheckSignPhotoNotLike(String value) {
            addCriterion("is_check_sign_photo not like", value, "isCheckSignPhoto");
            return (Criteria) this;
        }

        public Criteria andIsCheckSignPhotoIn(List<String> values) {
            addCriterion("is_check_sign_photo in", values, "isCheckSignPhoto");
            return (Criteria) this;
        }

        public Criteria andIsCheckSignPhotoNotIn(List<String> values) {
            addCriterion("is_check_sign_photo not in", values, "isCheckSignPhoto");
            return (Criteria) this;
        }

        public Criteria andIsCheckSignPhotoBetween(String value1, String value2) {
            addCriterion("is_check_sign_photo between", value1, value2, "isCheckSignPhoto");
            return (Criteria) this;
        }

        public Criteria andIsCheckSignPhotoNotBetween(String value1, String value2) {
            addCriterion("is_check_sign_photo not between", value1, value2, "isCheckSignPhoto");
            return (Criteria) this;
        }

        public Criteria andNotePictureIsNull() {
            addCriterion("note_picture is null");
            return (Criteria) this;
        }

        public Criteria andNotePictureIsNotNull() {
            addCriterion("note_picture is not null");
            return (Criteria) this;
        }

        public Criteria andNotePictureEqualTo(String value) {
            addCriterion("note_picture =", value, "notePicture");
            return (Criteria) this;
        }

        public Criteria andNotePictureNotEqualTo(String value) {
            addCriterion("note_picture <>", value, "notePicture");
            return (Criteria) this;
        }

        public Criteria andNotePictureGreaterThan(String value) {
            addCriterion("note_picture >", value, "notePicture");
            return (Criteria) this;
        }

        public Criteria andNotePictureGreaterThanOrEqualTo(String value) {
            addCriterion("note_picture >=", value, "notePicture");
            return (Criteria) this;
        }

        public Criteria andNotePictureLessThan(String value) {
            addCriterion("note_picture <", value, "notePicture");
            return (Criteria) this;
        }

        public Criteria andNotePictureLessThanOrEqualTo(String value) {
            addCriterion("note_picture <=", value, "notePicture");
            return (Criteria) this;
        }

        public Criteria andNotePictureLike(String value) {
            addCriterion("note_picture like", value, "notePicture");
            return (Criteria) this;
        }

        public Criteria andNotePictureNotLike(String value) {
            addCriterion("note_picture not like", value, "notePicture");
            return (Criteria) this;
        }

        public Criteria andNotePictureIn(List<String> values) {
            addCriterion("note_picture in", values, "notePicture");
            return (Criteria) this;
        }

        public Criteria andNotePictureNotIn(List<String> values) {
            addCriterion("note_picture not in", values, "notePicture");
            return (Criteria) this;
        }

        public Criteria andNotePictureBetween(String value1, String value2) {
            addCriterion("note_picture between", value1, value2, "notePicture");
            return (Criteria) this;
        }

        public Criteria andNotePictureNotBetween(String value1, String value2) {
            addCriterion("note_picture not between", value1, value2, "notePicture");
            return (Criteria) this;
        }

        public Criteria andIsProprietaryMerchantCreatedIsNull() {
            addCriterion("is_proprietary_merchant_created is null");
            return (Criteria) this;
        }

        public Criteria andIsProprietaryMerchantCreatedIsNotNull() {
            addCriterion("is_proprietary_merchant_created is not null");
            return (Criteria) this;
        }

        public Criteria andIsProprietaryMerchantCreatedEqualTo(String value) {
            addCriterion("is_proprietary_merchant_created =", value, "isProprietaryMerchantCreated");
            return (Criteria) this;
        }

        public Criteria andIsProprietaryMerchantCreatedNotEqualTo(String value) {
            addCriterion("is_proprietary_merchant_created <>", value, "isProprietaryMerchantCreated");
            return (Criteria) this;
        }

        public Criteria andIsProprietaryMerchantCreatedGreaterThan(String value) {
            addCriterion("is_proprietary_merchant_created >", value, "isProprietaryMerchantCreated");
            return (Criteria) this;
        }

        public Criteria andIsProprietaryMerchantCreatedGreaterThanOrEqualTo(String value) {
            addCriterion("is_proprietary_merchant_created >=", value, "isProprietaryMerchantCreated");
            return (Criteria) this;
        }

        public Criteria andIsProprietaryMerchantCreatedLessThan(String value) {
            addCriterion("is_proprietary_merchant_created <", value, "isProprietaryMerchantCreated");
            return (Criteria) this;
        }

        public Criteria andIsProprietaryMerchantCreatedLessThanOrEqualTo(String value) {
            addCriterion("is_proprietary_merchant_created <=", value, "isProprietaryMerchantCreated");
            return (Criteria) this;
        }

        public Criteria andIsProprietaryMerchantCreatedLike(String value) {
            addCriterion("is_proprietary_merchant_created like", value, "isProprietaryMerchantCreated");
            return (Criteria) this;
        }

        public Criteria andIsProprietaryMerchantCreatedNotLike(String value) {
            addCriterion("is_proprietary_merchant_created not like", value, "isProprietaryMerchantCreated");
            return (Criteria) this;
        }

        public Criteria andIsProprietaryMerchantCreatedIn(List<String> values) {
            addCriterion("is_proprietary_merchant_created in", values, "isProprietaryMerchantCreated");
            return (Criteria) this;
        }

        public Criteria andIsProprietaryMerchantCreatedNotIn(List<String> values) {
            addCriterion("is_proprietary_merchant_created not in", values, "isProprietaryMerchantCreated");
            return (Criteria) this;
        }

        public Criteria andIsProprietaryMerchantCreatedBetween(String value1, String value2) {
            addCriterion("is_proprietary_merchant_created between", value1, value2, "isProprietaryMerchantCreated");
            return (Criteria) this;
        }

        public Criteria andIsProprietaryMerchantCreatedNotBetween(String value1, String value2) {
            addCriterion("is_proprietary_merchant_created not between", value1, value2, "isProprietaryMerchantCreated");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}