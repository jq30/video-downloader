#!/bin/bash

touch combined.ts

for ((i = 1 ; ; i++)); do
  if [[ -e "$i.ts" ]]; then
    cat "$i.ts" >> combined.ts
    rm "$i.ts"
  else
    break
  fi
done
