package com.dipankar.onlinestore.users.util;



import com.dipankar.onlinestore.users.util.exception.ApplicationException;
import com.dipankar.onlinestore.users.util.exception.ExceptionType;

import java.util.Optional;

public interface CommonUtil {

    /**
     * Returns the value contained in the given {@link Optional} if present, otherwise throws an {@link ApplicationException}
     * with {@link ExceptionType#NO_DATA_FOUND}.
     *
     * @param optional the Optional to extract the value from
     * @param <T> the type of the value
     * @return the contained value if present
     * @throws ApplicationException with ExceptionType.NO_DATA_FOUND if the Optional is empty
     */
    static <T> T handleOptional(Optional<T> optional) throws ApplicationException {
        return optional.orElseThrow(() -> new ApplicationException(ExceptionType.NO_DATA_FOUND));
    }
}
