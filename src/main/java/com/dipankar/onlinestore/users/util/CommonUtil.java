package com.dipankar.onlinestore.users.util;



import com.dipankar.onlinestore.users.util.exception.ApplicationException;
import com.dipankar.onlinestore.users.util.exception.ExceptionType;

import java.util.Optional;

public class CommonUtil {

    public static <T> T handleOptional(Optional<T> obj) throws ApplicationException {
        if (obj.isPresent()) {
            return obj.get();
        }
        throw new ApplicationException(ExceptionType.NO_DATA_FOUND);
    }
}
