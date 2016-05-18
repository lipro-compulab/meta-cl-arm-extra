require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

SUMMARY = "CompuLab 3.14.52 kernel"
DESCRIPTION = "Linux kernel for CompuLab cl-som-imx6ul boards."

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "cl-som-imx6ul-imx_3.14.52_1.1.1_ga"
SRCREV = "7ac8f2f8ef937a20ea8ac70eb5d35a07cce6c1ac"
LOCALVERSION = "-imx6ul-cl-som-imx6ul"

SRC_URI = "git://github.com/lipro-compulab/cl-som-imx6ul-kernel.git;branch=${SRCBRANCH} \
           file://defconfig \
"

COMPATIBLE_MACHINE = "(cl-som-imx6ul)"
