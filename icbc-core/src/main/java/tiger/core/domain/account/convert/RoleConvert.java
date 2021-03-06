package tiger.core.domain.account.convert;

import tiger.common.dal.enums.RoleEnum;
import tiger.common.dal.persistence.account.RoleDO;
import tiger.core.domain.account.RoleDomain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/10/10.
 */
public class RoleConvert {

    public static RoleDomain convert2Domain(RoleDO source) {
        RoleDomain target = new RoleDomain();
        target.setId(source.getId());
        target.setName(RoleEnum.getEnumByCode(source.getName()));
        return target;
    }

    public static List<RoleDomain> convert2Domain(List<RoleDO> sourceList) {
        List<RoleDomain> targetList = new ArrayList<>();
        for (RoleDO source : sourceList) {
            RoleDomain target = convert2Domain(source);
            targetList.add(target);
        }
        return targetList;
    }
}
