require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

SUMMARY = "CompuLab 4.1.15 kernel"
DESCRIPTION = "Linux kernel for CompuLab cl-som-imx6ul boards."

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "cl-som-imx6ul-imx_4.1.15_1.1.0_ga"
SRCREV = "4acab14e60dcfb95adf338a5f687d153ce348caa"
LOCALVERSION = "-imx6ul-cl-som-imx6ul"

SRC_URI = "git://github.com/lipro-compulab/cl-som-imx6ul-kernel.git;branch=${SRCBRANCH} \
           file://defconfig \
"

COMPATIBLE_MACHINE = "(cl-som-imx6ul)"
