package daag.web.api.v1.controller.slice.validator;

import daag.model.v1.slice.Vo.UpdateSlice;
import daag.util.StringUtil;
import daag.util.exception.CodeMsg;
import daag.util.exception.DaagException;

/**
 * Created by yq on 2018/4/11.
 */
public class SliceValidator {

    public static boolean convert(UpdateSlice updateSlice) throws DaagException {
        if (StringUtil.isEmpty(updateSlice.getId()) || (StringUtil.isEmpty(updateSlice.getType()) && StringUtil.isEmpty(updateSlice.getSlicesql())
                && StringUtil.isEmpty(updateSlice.getSetting()) && StringUtil.isEmpty(updateSlice.getDatasource_id()))){
            throw new DaagException(CodeMsg.SliceParamErrMsg,CodeMsg.SliceParamErrCode);
        }
        return true;
    }
}
