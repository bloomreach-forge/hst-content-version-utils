package org.onehippo.forge.hst.version.util;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class FrozenNodeUtilsTest {
    @Test void frozenNodeUtils_class_isAccessible() { assertDoesNotThrow(() -> Class.forName("org.onehippo.forge.hst.version.util.FrozenNodeUtils")); }
    @Test void jcrVersionUtils_class_isAccessible() { assertDoesNotThrow(() -> Class.forName("org.onehippo.forge.hst.version.util.JcrVersionUtils")); }
}
