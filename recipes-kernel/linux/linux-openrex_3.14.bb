# Copyright (C) 2015, 2016 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux Kernel for OpenRex board"
DESCRIPTION = "Linux Kernel for OpenRex board. More info \
at http://www.imx6rex.com/open-rex"

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

LOCALVERSION = "-fslc"

SRCBRANCH = "jethro"

SRCREV = "a7896090be13258a215d0e362c82638fe0b0ed05"

SRC_URI = "git://https://github.com/famodio/openrex-linux-3.14.git;branch=${SRCBRANCH} \
           file://defconfig"


# PV .= "+git${SRCPV}"



COMPATIBLE_MACHINE = "(mx6|mx7|imx6q-openrex|imx6s-openrex)"
