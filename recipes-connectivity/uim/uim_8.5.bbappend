# Fix an well known cross sompile issue
# https://bugzilla.yoctoproject.org/1466

PR .= ".1"

EXTRA_OEMAKE = "CC="${CC}""
