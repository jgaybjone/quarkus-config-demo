package org.github.keking.apollo;
public final class ApolloConfig$$accessor {
    private ApolloConfig$$accessor() {}
    @SuppressWarnings("unchecked")
    public static boolean get_enabled(Object __instance) {
        return ((ApolloConfig)__instance).enabled;
    }
    @SuppressWarnings("unchecked")
    public static void set_enabled(Object __instance, boolean enabled) {
        ((ApolloConfig)__instance).enabled = enabled;
    }
    @SuppressWarnings("unchecked")
    public static Object get_namespace(Object __instance) {
        return ((ApolloConfig)__instance).namespace;
    }
    @SuppressWarnings("unchecked")
    public static void set_namespace(Object __instance, Object namespace) {
        ((ApolloConfig)__instance).namespace = (java.util.Optional<String>)namespace;
    }
}
