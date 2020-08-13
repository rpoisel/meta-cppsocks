PN="cppsocks"
PV="1.0.0"
PV_MAJOR = "${@d.getVar('PV',d,1).split('.')[0]}"
PV_MINOR = "${@d.getVar('PV',d,1).split('.')[1]}"
P="${PN}-${PV}"

DESCRIPTION="C++11 WebSockets Framework"
MAINTAINER="Rainer Poisel <rainer.poisel@gmail.com>"
LICENSE="MIT"

FILESEXTRAPATHS_prepend:="${THISDIR}/${PN}:"
RDEPENDS_${PN}+=""
DEPENDS+=""
DEPENDS+="cmake"

SRC_URI = "gitsm://github.com/rpoisel/cppsocks.git;protocol=https;branch=master"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"
LIC_FILES_CHKSUM = "file://../git/LICENSE;md5=3a1c9ee7d81e2e164be8951409c564d0"

inherit pkgconfig cmake

