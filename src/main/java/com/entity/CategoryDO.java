package com.entity;

public class CategoryDO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.category_name
     *
     * @mbggenerated
     */
    private String categoryName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.parent_category
     *
     * @mbggenerated
     */
    private Integer parentCategory;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.id
     *
     * @return the value of category.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.id
     *
     * @param id the value for category.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.category_name
     *
     * @return the value of category.category_name
     *
     * @mbggenerated
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.category_name
     *
     * @param categoryName the value for category.category_name
     *
     * @mbggenerated
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.parent_category
     *
     * @return the value of category.parent_category
     *
     * @mbggenerated
     */
    public Integer getParentCategory() {
        return parentCategory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.parent_category
     *
     * @param parentCategory the value for category.parent_category
     *
     * @mbggenerated
     */
    public void setParentCategory(Integer parentCategory) {
        this.parentCategory = parentCategory;
    }
}