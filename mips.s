.text

main:

addi $sp, $sp, 0
addi $sp, $sp, 8
foo_scope3:
li $s6, 10
addi $t0,$s6,0
addi $t1,$t0,0
addi $t2,$t1,0
addi $sp, $sp, 12
sw $a0, -8($sp)
sw $v0, -4($sp)
sw $v1, -0($sp)
li $v0, 1
move $a0, $t2
syscall
lw $v0, -4($sp)
lw $v1, -0($sp)
lw $a0, -8($sp)
addi $sp, $sp, -12
li $s6, 0
addi $t3,$s6,0
move $v0, $t3
jr $ra
addi $sp, $sp, -8
addi $sp, $sp, 0
addi $sp, $sp, 0
addi $sp, $sp, 20
sw $ra, -16($sp)
sw $a0, -12($sp)
sw $t0, -8($sp)
sw $t1, -4($sp)
sw $v0, 0($sp)
li $a0, 2
sll $a0, $a0, 2
li $v0, 9
syscall
lw $t0, -8($sp)
lw $t1, -4($sp)
lw $a0, -12($sp)
move $t4, $v0
lw $v0, 0($sp)
lw $ra, -16($sp)
addi $sp, $sp, -20
addi $t5,$t4,0
lw $t6 12($sp)
lw $t6, 0($sp)
addi $t7,$t6,0
addi $t8,$t7,0
addi $sp, $sp, 12
sw $a0, -8($sp)
sw $v0, -4($sp)
sw $v1, -0($sp)
li $v0, 1
move $a0, $t8
syscall
lw $v0, -4($sp)
lw $v1, -0($sp)
lw $a0, -8($sp)
addi $sp, $sp, -12
addi $sp, $sp, 0
li $v0, 10 
syscall
