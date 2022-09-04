# GRAPHICS MC

### Commands
`/gmcmode <MODE>`  
Change the gmc mode to : 
- `image` for images
- `none` for the default map
- `test` for the testing mode, (all new maps will be rendered in test mode by default if this is enabled)
- `frames` for video frames

*all other modes are currently unsupported*  
`/gmcrender <map_id> <arg1> <arg2> <arg *> ...`  
  
Render a specific map in the current mode with some parameters.

### Examples
`/gmcmode image`  Change into image mode  
`/gmcrender 2 IMG.png` Render *IMG.png* on map with id 2.  
`/gmcmode frames` Change into frames mode   
`/gmcrender <ticks between frames> <directory (from server jar)> <file extension of the images>`



