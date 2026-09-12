# Notas: Cómo actualizar mi repo con los cambios de LuisDaniel

## Remotos que ya tengo configurados
- `origin` → mi repositorio (Frostmourne09/Sys-Ventas)
- `LuisDaniel` → repositorio de mi compañero (LuiDaniel/SysVentas)

Verificar en cualquier momento con:
```bash
git remote -v
```

## Flujo normal (sin conflictos)

```bash
git pull origin main
git fetch LuisDaniel
git merge LuisDaniel/main
git push origin main
```

1. `git pull origin main` → me aseguro de tener lo último de mi propio repo antes de mezclar nada (evita el error "rejected... fetch first").
2. `git fetch LuisDaniel` → descargo lo nuevo que subió mi compañero, sin tocar mis archivos todavía.
3. `git merge LuisDaniel/main` → fusiono esos cambios con mi rama local.
4. `git push origin main` → subo todo a mi propio repositorio en GitHub.

Si no sé cómo se llama la rama principal de mi compañero, reviso con:
```bash
git branch -r
```

## Si aparecen conflictos

Git marca el archivo así:
```
<<<<<<< HEAD
(mi versión)
=======
(la versión de LuisDaniel)
>>>>>>> LuisDaniel/main
```

Pasos:
1. Abrir el archivo y decidir qué código dejar (o combinar ambas partes).
2. Borrar las marcas `<<<<<<<`, `=======`, `>>>>>>>` — el archivo debe quedar limpio, como un archivo normal.
3. Confirmar la resolución:
```bash
git add .
git commit -m "Resolver conflicto de merge"
git push origin main
```

## Cosas que ya NO debería volver a necesitar
- `git remote add LuisDaniel ...` → ya está agregado, no hace falta repetirlo.
- `--allow-unrelated-histories` → solo fue necesario la primera vez porque los historiales de git no estaban conectados. Ahora que ya se fusionaron una vez, los próximos merges deberían ser normales.

## Errores que ya resolví antes (por si vuelven a salir)

**"src refspec main does not match any"**
→ mi rama local se llamaba `master`. Se soluciona con:
```bash
git branch -M main
```

**"fatal: 'origin' does not appear to be a git repository"**
→ me faltaba agregar mi propio repo como remoto:
```bash
git remote add origin https://github.com/Frostmourne09/Sys-Ventas.git
```

**"! [rejected] main -> main (fetch first)"**
→ mi repo local estaba desactualizado respecto a mi propio `origin`. Se soluciona con:
```bash
git pull origin main
```

**"fatal: refusing to merge unrelated histories"**
→ pasó la primera vez que fusioné con el repo de LuisDaniel porque los historiales no tenían relación. Se soluciona (solo si vuelve a pasar) con:
```bash
git pull origin main --allow-unrelated-histories
```

## Cuidado con esto
No copiar manualmente la carpeta del proyecto de mi compañero dentro de mi propio proyecto (eso fue lo que generó la carpeta duplicada `SysVentas/` dentro de `Sys-Ventas/`). Siempre usar `fetch` + `merge`, nunca copiar y pegar carpetas.
