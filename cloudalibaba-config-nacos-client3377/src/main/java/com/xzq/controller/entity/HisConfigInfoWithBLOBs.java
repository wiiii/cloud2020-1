package com.xzq.controller.entity;

import java.io.Serializable;

/**
 * his_config_info
 * @author 
 */
public class HisConfigInfoWithBLOBs extends HisConfigInfo implements Serializable {
    private String content;

    private String srcUser;

    private static final long serialVersionUID = 1L;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSrcUser() {
        return srcUser;
    }

    public void setSrcUser(String srcUser) {
        this.srcUser = srcUser;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        HisConfigInfoWithBLOBs other = (HisConfigInfoWithBLOBs) that;
        return (this.getNid() == null ? other.getNid() == null : this.getNid().equals(other.getNid()))
            && (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDataId() == null ? other.getDataId() == null : this.getDataId().equals(other.getDataId()))
            && (this.getGroupId() == null ? other.getGroupId() == null : this.getGroupId().equals(other.getGroupId()))
            && (this.getAppName() == null ? other.getAppName() == null : this.getAppName().equals(other.getAppName()))
            && (this.getMd5() == null ? other.getMd5() == null : this.getMd5().equals(other.getMd5()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()))
            && (this.getSrcIp() == null ? other.getSrcIp() == null : this.getSrcIp().equals(other.getSrcIp()))
            && (this.getOpType() == null ? other.getOpType() == null : this.getOpType().equals(other.getOpType()))
            && (this.getTenantId() == null ? other.getTenantId() == null : this.getTenantId().equals(other.getTenantId()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getSrcUser() == null ? other.getSrcUser() == null : this.getSrcUser().equals(other.getSrcUser()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNid() == null) ? 0 : getNid().hashCode());
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDataId() == null) ? 0 : getDataId().hashCode());
        result = prime * result + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        result = prime * result + ((getAppName() == null) ? 0 : getAppName().hashCode());
        result = prime * result + ((getMd5() == null) ? 0 : getMd5().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        result = prime * result + ((getSrcIp() == null) ? 0 : getSrcIp().hashCode());
        result = prime * result + ((getOpType() == null) ? 0 : getOpType().hashCode());
        result = prime * result + ((getTenantId() == null) ? 0 : getTenantId().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getSrcUser() == null) ? 0 : getSrcUser().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", content=").append(content);
        sb.append(", srcUser=").append(srcUser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}