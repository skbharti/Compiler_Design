.data

z: .word 0
c: .word 0
a0: .word 0
a1: .word 0
a2: .word 0
a3: .word 0
a4: .word 0
a5: .word 0
a6: .word 0
a7: .word 0
a8: .word 0
a9: .word 0
a10: .word 0
a11: .word 0
a12: .word 0
a13: .word 0
a14: .word 0
a15: .word 0
a16: .word 0
a17: .word 0
a18: .word 0
a19: .word 0
a20: .word 0
a21: .word 0
a22: .word 0
a23: .word 0
a24: .word 0
a25: .word 0
a26: .word 0
a27: .word 0
a28: .word 0
a29: .word 0
a30: .word 0
a31: .word 0
D_1761: .word 0
D_1762: .word 0
D_1763: .word 0
D_1764: .word 0
D_1765: .word 0
D_1766: .word 0
D_1767: .word 0
D_1768: .word 0
D_1769: .word 0
D_1770: .word 0
D_1771: .word 0
D_1772: .word 0
D_1773: .word 0
D_1774: .word 0
D_1775: .word 0
D_1776: .word 0
D_1777: .word 0
D_1778: .word 0
D_1779: .word 0
D_1780: .word 0
D_1781: .word 0
D_1782: .word 0
D_1783: .word 0
D_1784: .word 0
D_1785: .word 0
D_1786: .word 0
D_1787: .word 0
D_1788: .word 0
D_1789: .word 0
D_1790: .word 0
b_0: .word 0
b: .word 0
D_1793: .word 0
D_1794: .word 0
D_1795: .word 0
D_1796: .word 0
D_1797: .word 0
D_1798: .word 0
D_1799: .word 0
D_1800: .word 0
D_1801: .word 0
D_1802: .word 0
D_1803: .word 0
D_1804: .word 0
D_1805: .word 0
D_1806: .word 0
D_1807: .word 0
D_1808: .word 0
D_1809: .word 0
D_1810: .word 0
D_1811: .word 0
D_1812: .word 0
D_1813: .word 0
D_1814: .word 0
D_1815: .word 0
D_1816: .word 0
D_1817: .word 0
D_1818: .word 0
D_1819: .word 0
D_1820: .word 0
D_1821: .word 0
D_1822: .word 0
b_1: .word 0
D_1824: .word 0
newline: .asciiz "\n"

.text

main:

li $s6, 0
addi $t0,$s6,1
li $s6, 0
addi $t1,$s6,10
li $s6, 0
addi $t2,$s6,1
li $s6, 0
addi $t3,$s6,1
li $s6, 0
addi $t4,$s6,1
li $s6, 0
addi $t5,$s6,2
li $s6, 0
addi $t6,$s6,0
li $s6, 0
addi $t7,$s6,1
li $s6, 0
addi $t8,$s6,0
li $s6, 0
addi $t9,$s6,1
li $s6, 0
addi $s0,$s6,0
li $s6, 0
addi $s1,$s6,2
li $s6, 0
addi $s2,$s6,1
li $s6, 0
addi $s3,$s6,2
li $s6, 0
addi $s4,$s6,0
li $s6, 0
addi $s5,$s6,2
sw $t0 z
li $s6, 0
addi $t0,$s6,0
sw $t0 a14
li $s6, 0
addi $t0,$s6,1
sw $t0 a15
li $s6, 0
addi $t0,$s6,2
sw $t0 a16
li $s6, 0
addi $t0,$s6,2
sw $t0 a17
li $s6, 0
addi $t0,$s6,0
sw $t0 a18
li $s6, 0
addi $t0,$s6,1
sw $t0 a19
li $s6, 0
addi $t0,$s6,0
sw $t0 a20
li $s6, 0
addi $t0,$s6,1
sw $t0 a21
li $s6, 0
addi $t0,$s6,0
sw $t0 a22
li $s6, 0
addi $t0,$s6,1
sw $t0 a23
li $s6, 0
addi $t0,$s6,0
sw $t0 a24
li $s6, 0
addi $t0,$s6,0
sw $t0 a25
li $s6, 0
addi $t0,$s6,0
sw $t0 a26
li $s6, 0
addi $t0,$s6,2
sw $t0 a27
li $s6, 0
addi $t0,$s6,2
sw $t0 a28
li $s6, 0
addi $t0,$s6,0
sw $t0 a29
li $s6, 0
addi $t0,$s6,0
sw $t0 a30
li $s6, 0
addi $t0,$s6,1
sw $t0, a31
sw $t1, c
sw $t2, a0
sw $t3, a1
sw $t4, a2
sw $t5, a3
sw $t6, a4
sw $t7, a5
sw $t8, a6
sw $t9, a7
sw  $s0, a8
sw  $s1, a9
sw  $s2, a10
sw  $s3, a11
sw  $s4, a12
sw  $s5, a13
bgtz $t1, D_1759
lw $t0 z
sw $t0, z
bgtz $t0, D_1760
D_1759:
lw $t0 a0
lw $t1 a1
add $t2,$t0,$t1
lw $t3 a2
add $t4,$t2,$t3
lw $t5 a3
add $t6,$t4,$t5
lw $t7 a4
add $t8,$t6,$t7
lw $t9 a5
add $s0,$t8,$t9
lw $s1 a6
add $s2,$s0,$s1
lw $s3 a7
add $s4,$s2,$s3
sw $t0 a0
lw $s5 a8
add $t0,$s4,$s5
sw $t2 D_1761
sw $t1 a1
lw $t1 a9
add $t2,$t0,$t1
sw $t0 D_1768
sw $t1 a9
lw $t0 a10
add $t1,$t2,$t0
sw $t2 D_1769
sw $t0 a10
lw $t0 a11
add $t2,$t1,$t0
sw $t0 a11
sw $t1 D_1770
lw $t0 a12
add $t1,$t2,$t0
sw $t0 a12
sw $t2 D_1771
lw $t0 a13
add $t2,$t1,$t0
sw $t0 a13
sw $t1 D_1772
lw $t0 a14
add $t1,$t2,$t0
sw $t0 a14
sw $t2 D_1773
lw $t0 a15
add $t2,$t1,$t0
sw $t0 a15
sw $t1 D_1774
lw $t0 a16
add $t1,$t2,$t0
sw $t0 a16
sw $t2 D_1775
lw $t0 a17
add $t2,$t1,$t0
sw $t0 a17
sw $t1 D_1776
lw $t0 a18
add $t1,$t2,$t0
sw $t0 a18
sw $t2 D_1777
lw $t0 a19
add $t2,$t1,$t0
sw $t0 a19
sw $t1 D_1778
lw $t0 a20
add $t1,$t2,$t0
sw $t2 D_1779
sw $t0 a20
lw $t0 a21
add $t2,$t1,$t0
sw $t1 D_1780
sw $t0 a21
lw $t0 a22
add $t1,$t2,$t0
sw $t2 D_1781
sw $t0 a22
lw $t0 a23
add $t2,$t1,$t0
sw $t1 D_1782
sw $t0 a23
lw $t0 a24
add $t1,$t2,$t0
sw $t2 D_1783
sw $t0 a24
lw $t0 a25
add $t2,$t1,$t0
sw $t0 a25
sw $t1 D_1784
lw $t0 a26
add $t1,$t2,$t0
sw $t0 a26
sw $t2 D_1785
lw $t0 a27
add $t2,$t1,$t0
sw $t0 a27
sw $t1 D_1786
lw $t0 a28
add $t1,$t2,$t0
sw $t0 a28
sw $t2 D_1787
lw $t0 a29
add $t2,$t1,$t0
sw $t0 a29
sw $t1 D_1788
lw $t0 a30
add $t1,$t2,$t0
sw $t0 a30
sw $t2 D_1789
lw $t0 a31
add $t2,$t1,$t0
sw $t0 a31
addi $t0,$t2,0
sw $t0 b
lw $t0 z
sw $t0, z
sw $t1, D_1790
sw $t2, b_0
sw $t3, a2
sw $t4, D_1762
sw $t5, a3
sw $t6, D_1763
sw $t7, a4
sw $t8, D_1764
sw $t9, a5
sw  $s0, D_1765
sw  $s1, a6
sw  $s2, D_1766
sw  $s3, a7
sw  $s4, D_1767
sw  $s5, a8
bgtz $t0, D_1792
D_1760:
lw $t0 a0
lw $t1 a1
add $t2,$t0,$t1
lw $t3 a2
add $t4,$t2,$t3
lw $t5 a3
add $t6,$t4,$t5
lw $t7 a4
add $t8,$t6,$t7
lw $t9 a5
add $s0,$t8,$t9
lw $s1 a6
add $s2,$s0,$s1
lw $s3 a7
add $s4,$s2,$s3
sw $t0 a0
lw $s5 a8
add $t0,$s4,$s5
sw $t2 D_1793
sw $t1 a1
lw $t1 a9
add $t2,$t0,$t1
sw $t1 a9
sw $t0 D_1800
lw $t0 a10
add $t1,$t2,$t0
sw $t0 a10
sw $t2 D_1801
lw $t0 a11
add $t2,$t1,$t0
sw $t0 a11
sw $t1 D_1802
lw $t0 a12
add $t1,$t2,$t0
sw $t0 a12
sw $t2 D_1803
lw $t0 a13
add $t2,$t1,$t0
sw $t0 a13
sw $t1 D_1804
lw $t0 a14
add $t1,$t2,$t0
sw $t0 a14
sw $t2 D_1805
lw $t0 a15
add $t2,$t1,$t0
sw $t0 a15
sw $t1 D_1806
lw $t0 a16
add $t1,$t2,$t0
sw $t0 a16
sw $t2 D_1807
lw $t0 a17
add $t2,$t1,$t0
sw $t0 a17
sw $t1 D_1808
lw $t0 a18
add $t1,$t2,$t0
sw $t0 a18
sw $t2 D_1809
lw $t0 a19
add $t2,$t1,$t0
sw $t0 a19
sw $t1 D_1810
lw $t0 a20
add $t1,$t2,$t0
sw $t2 D_1811
sw $t0 a20
lw $t0 a21
add $t2,$t1,$t0
sw $t1 D_1812
sw $t0 a21
lw $t0 a22
add $t1,$t2,$t0
sw $t2 D_1813
sw $t0 a22
lw $t0 a23
add $t2,$t1,$t0
sw $t1 D_1814
sw $t0 a23
lw $t0 a24
add $t1,$t2,$t0
sw $t2 D_1815
sw $t0 a24
lw $t0 a25
add $t2,$t1,$t0
sw $t1 D_1816
sw $t0 a25
lw $t0 a26
add $t1,$t2,$t0
sw $t2 D_1817
sw $t0 a26
lw $t0 a27
add $t2,$t1,$t0
sw $t1 D_1818
sw $t0 a27
lw $t0 a28
add $t1,$t2,$t0
sw $t2 D_1819
sw $t0 a28
lw $t0 a29
add $t2,$t1,$t0
sw $t0 a29
sw $t1 D_1820
lw $t0 a30
add $t1,$t2,$t0
sw $t0 a30
sw $t2 D_1821
lw $t0 a31
add $t2,$t1,$t0
sw $t0 a31
sw $t0, b
sw $t1, D_1822
sw $t2, b_1
sw $t3, a2
sw $t4, D_1794
sw $t5, a3
sw $t6, D_1795
sw $t7, a4
sw $t8, D_1796
sw $t9, a5
sw  $s0, D_1797
sw  $s1, a6
sw  $s2, D_1798
sw  $s3, a7
sw  $s4, D_1799
sw  $s5, a8
addi $t0,$t2,0
sw $t0, b
sw $t1, D_1822
sw $t2, b_1
sw $t3, a2
sw $t4, D_1794
sw $t5, a3
sw $t6, D_1795
sw $t7, a4
sw $t8, D_1796
sw $t9, a5
sw  $s0, D_1797
sw  $s1, a6
sw  $s2, D_1798
sw  $s3, a7
sw  $s4, D_1799
sw  $s5, a8
D_1792:
lw $t0 b
addi $sp, $sp, -12
sw $a0, 8($sp)
sw $v0, 4($sp)
sw $v1, 0($sp)
li $v0, 1
move $a0, $t0
syscall
li $v0, 4
la $a0, newline
syscall
lw $v0, 4($sp)
lw $v1, 0($sp)
lw $a0, 8($sp)
addi $sp, $sp, 12
sw $t0, b
sw $t1, D_1824
li $s6, 0
addi $t1,$s6,0
sw $t0, b
sw $t1, D_1824
