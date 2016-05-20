# Port an already known issue back to Fido, see:
# http://git.openembedded.org/meta-openembedded-contrib/commit/?id=7ca0d80

FILESEXTRAPATHS_append := "${THISDIR}/${PN}-${PV}:"

PR .= ".1"

SRC_URI_append = " \
    file://add-sysroot-to-gcc.patch;patchdir=.. \
"
